package com.optimagrowth.license.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class LicenseModel {
    private int id;
    private String licenseId;
    private String description;
    private String orgainizationId;
    private String productName;
    private String licenseType;
}
