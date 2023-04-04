package com.mikh.diap.config;

import com.mikh.diap.domain.HuntingApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

@Configuration
public class QueueConfig {
    @Bean
    public BlockingQueue<HuntingApplication> jobApplications() {
        return new ArrayBlockingQueue<HuntingApplication>(5);
    }
}
