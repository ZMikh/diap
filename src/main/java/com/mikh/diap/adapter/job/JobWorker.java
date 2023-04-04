package com.mikh.diap.adapter.job;

import com.mikh.diap.app.api.inbound.ApplicationCheckService;
import com.mikh.diap.domain.HuntingApplication;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;

@Service
@Slf4j
@RequiredArgsConstructor
public class JobWorker {
    private final BlockingQueue<HuntingApplication> jobApplications;
    private final ApplicationCheckService checkService;

    @Async
    @EventListener(ApplicationReadyEvent.class)
    public void execute() throws InterruptedException {
        while (true) {
            try {
                HuntingApplication huntingApplication = jobApplications.take();
                checkService.approveApplication(huntingApplication);
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }
    }
}
