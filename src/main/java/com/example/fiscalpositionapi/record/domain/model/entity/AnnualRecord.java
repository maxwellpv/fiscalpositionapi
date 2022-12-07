package com.example.fiscalpositionapi.record.domain.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AnnualRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String year;

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
