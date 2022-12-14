package com.example.fiscalpositionapi.annualRecord.resource;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAnnualRecordResource {
    @NotNull
    private int year;

    @NotNull
    @NotBlank
    private String state;

    @NotNull
    @NotBlank
    private String category;

    @NotNull
    @NotBlank
    private String item;

    @NotNull
    private Double amount;

    @NotNull
    private Double gdp;
}


