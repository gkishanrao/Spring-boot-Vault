package com.nirwantech.spring_boot_vault;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component

@ConfigurationProperties(prefix = "")
public class VaultConfiguration {
    private String username;
    private String password;
}