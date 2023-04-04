package com.mikh.diap.adapter.job;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("settings.job")
@Getter
@Setter
public class JobProperties {
    private boolean isActive;
}
