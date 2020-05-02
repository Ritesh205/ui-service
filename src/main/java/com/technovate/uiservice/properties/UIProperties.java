package com.technovate.uiservice.properties;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Data
@Configuration
@ConfigurationProperties(prefix = "ui-service")
@RefreshScope
public class UIProperties {

    UIProperties() {

        log.debug(this.toString());
    }

    private String message;
}
