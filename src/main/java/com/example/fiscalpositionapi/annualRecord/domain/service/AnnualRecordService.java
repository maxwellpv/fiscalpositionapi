package com.example.fiscalpositionapi.annualRecord.domain.service;

import com.example.fiscalpositionapi.annualRecord.domain.model.entity.AnnualRecord;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AnnualRecordService {
    List<AnnualRecord> getAll();
    AnnualRecord create(AnnualRecord annualRecord);
    AnnualRecord update(Long recordId, AnnualRecord annualRecord);
    ResponseEntity<?> delete(Long recordId);
}
