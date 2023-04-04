package com.mikh.diap.adapter.job;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/job")
@RequiredArgsConstructor
@Slf4j
public class JobController {
    private final JobProperties property;

    @PostMapping
    @Operation(summary = "Toggle to start/stop applications approval")
    public void toggleJob() {
        log.info("Start applications approval");
        property.setActive(!property.isActive());
    }
}
