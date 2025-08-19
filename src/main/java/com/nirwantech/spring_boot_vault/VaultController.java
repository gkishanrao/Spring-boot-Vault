package com.nirwantech.spring_boot_vault;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class VaultController {
    private final VaultConfiguration vaultConfiguration;



    @GetMapping("/getDataFromVault")
    public String getDataFromVault() {
        System.out.println("/n UserName:: " + vaultConfiguration.getUsername());
        System.out.println("Password:: " + vaultConfiguration.getPassword());
        return "OK";
    }
}