package com.mikh.diap.app.impl;

import com.mikh.diap.app.api.inbound.ApplicationCheckService;
import com.mikh.diap.app.api.outbound.ApplicationPersistence;
import com.mikh.diap.domain.ApplicationState;
import com.mikh.diap.domain.HuntingApplication;
import com.mikh.diap.domain.HuntingResource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

import static com.mikh.diap.domain.ApplicationState.CREATED;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApplicationCheckServiceImpl implements ApplicationCheckService {
    private final ApplicationPersistence applicationPersistence;

    @Transactional
    @Override
    public void approveApplication(HuntingApplication application) {
        log.info("Starting approval application with id: {}", application.getId());
        if (!CREATED.equals(application.getApplicationState())) {
            return;
        }
        HuntingResource resource = application.getResource();

        if (resource.getQuota() < application.getCount()) {
            application.setApplicationState(ApplicationState.REJECTED);
            applicationPersistence.save(application);
            log.info("Application with id: {} is rejected", application.getId());
            return;
        }

        if (application.getCreationDate().isBefore(application.getResource().getApplicationStartDate()) ||
                application.getCreationDate().isAfter(application.getResource().getApplicationFinishDate())) {
            application.setApplicationState(ApplicationState.REJECTED);
            applicationPersistence.save(application);
            log.info("Application with id: {} is rejected", application.getId());
            return;
        }

        List<HuntingApplication> applications = applicationPersistence.findAllByHuntingLicenseSeriesAndNumber(
                application.getHuntingLicenseSeries(), application.getHuntingLicenseNumber());

        HuntingApplication foundApprovedApplication = applications.stream()
                .filter(app -> Objects.equals(app.getResource().getName(), application.getResource().getName()))
                .filter(app -> app.getApplicationState() == ApplicationState.APPROVED)
                .findFirst()
                .orElse(null);

        if (foundApprovedApplication != null) {
            application.setApplicationState(ApplicationState.REJECTED);
            applicationPersistence.save(application);
            log.info("Application with id: {} is rejected", application.getId());
            return;
        }

        application.setApplicationState(ApplicationState.APPROVED);
        applicationPersistence.save(application);
        log.info("Application with id: {} is approved", application.getId());
    }
}
