package com.belas.ika.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Ika Demo.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link IkaProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {}
