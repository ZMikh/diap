package com.mikh.diap.app.impl;

import com.mikh.diap.app.api.inbound.ApplicationService;
import com.mikh.diap.app.api.inbound.UpdateApplicationRequest;
import com.mikh.diap.app.api.outbound.ApplicationPersistence;
import com.mikh.diap.app.api.outbound.ResourcePersistence;
import com.mikh.diap.app.exception.ApplicationInformationException;
import com.mikh.diap.app.exception.ApplicationNotFoundException;
import com.mikh.diap.domain.ApplicationState;
import com.mikh.diap.domain.HuntingApplication;
import com.mikh.diap.domain.HuntingResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationPersistence applicationPersistence;
    private final ResourcePersistence resourcePersistence;

    @Transactional(readOnly = true)
    @Override
    public List<HuntingApplication> getAll() {
        return applicationPersistence.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public HuntingApplication getApplicationById(Long id) throws ApplicationNotFoundException {
        HuntingApplication application = applicationPersistence.findById(id);
        if (application == null) {
            throw new ApplicationNotFoundException();
        }
        return application;
    }

    @Transactional
    @Override
    public HuntingApplication addApplication(Long id, HuntingApplication huntingApplication) throws ApplicationInformationException {
        HuntingResource resource = resourcePersistence.findById(id);
        if (Objects.isNull(huntingApplication.getApplicationType())) {
            throw new ApplicationInformationException();
        }
        huntingApplication.setResource(resource);
        return applicationPersistence.save(huntingApplication);
    }

    @Transactional
    @Override
    public HuntingApplication updateApplication(Long id, UpdateApplicationRequest updateApplicationRequest) throws ApplicationNotFoundException {
        HuntingApplication application = applicationPersistence.findById(id);
        application.setApplicationState(ApplicationState.valueOf(updateApplicationRequest.getApplicationState()));
        return application;
    }

    @Transactional
    @Override
    public void deleteApplicationById(Long id) {
        applicationPersistence.deleteById(id);
    }
}
