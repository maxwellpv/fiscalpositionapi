package com.example.fiscalpositionapi.record.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateAnnualRecordResource {
    private String year;
    private String state;
    private String category;
    private String item;
    private Double amount;
    private Double gdp;
}
