package com.example.fiscalpositionapi.record.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("productMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public AnnualRecordMapper recordMapper(){return new AnnualRecordMapper();}
}
