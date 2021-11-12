package com.optimagrowth.license.service;

import com.optimagrowth.license.model.License;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;

@Service
public class LicenseService {
    private final MessageSource messageSource;

    public LicenseService(MessageSource messageSource) {
        this.messageSource = Objects.requireNonNull(messageSource);
    }

    public License getLicense(String licenseId, String organizationId) {
        var license = new License();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Software product");
        license.setProductName("Ostock");
        license.setLicenseType("full");
        return license;
    }

    public String createLicense(License license, String organizationId, Locale locale) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(messageSource.getMessage("license.create.message", null, locale), license);
        }
        return responseMessage;
    }

    public String updateLicense(License license, String organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(messageSource.getMessage("license.update.message", null, Locale.getDefault()), license);
        }
        return responseMessage;
    }

    public String deleteLicense(String licenseId, String organizationId) {
        return String.format(messageSource.getMessage("license.delete.message", null, Locale.getDefault()), licenseId, organizationId);
    }
}
