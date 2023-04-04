package com.mikh.diap.adapter.job;

import com.mikh.diap.app.api.outbound.ApplicationPersistence;
import com.mikh.diap.domain.ApplicationState;
import com.mikh.diap.domain.HuntingApplication;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;

@Service
@RequiredArgsConstructor
@Slf4j
public class JobScheduler {
    private final JobProperties jobProperties;
    private final BlockingQueue<HuntingApplication> jobApplications;
    private final ApplicationPersistence persistence;

    @Scheduled(fixedDelayString = "${settings.job.delay}")
    public void test() throws InterruptedException {
        if (jobProperties.isActive()) {
            HuntingApplication application = persistence.findByStatusAndOrderByDateTime(ApplicationState.CREATED);
            if (application == null) {
                return;
            }
            jobApplications.put(application);
        }
    }
}
