package com.optimagrowth.license.service;

import com.optimagrowth.license.model.License;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LicenseService {

    public License getLicense(String licenseId, String organizationId) {
        License license = new License();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrgainizationId(organizationId);
        license.setDescription("Software product.");
        license.setProductName("Ostock");
        license.setLicenseType("full");

        return license;
    }

    public String createLicense(License license, String organizationId) {
        String response = null;
        if (license != null) {
            license.setOrgainizationId(organizationId);
            response = String.format("This is the POST and the object is %s", license);
        }
        return response;
    }

    public String updateLicense(License license, String organizationId) {
        String response = null;
        if (license != null) {
            license.setOrgainizationId(organizationId);
            response = String.format("This is the PUT and the object is %s", license);
        }
        return response;
    }

    public String deleteLicesne(String licenseId, String organizationId) {
        return String.format("Deleting license with id %s for the organization %s", licenseId, organizationId);
    }
}
