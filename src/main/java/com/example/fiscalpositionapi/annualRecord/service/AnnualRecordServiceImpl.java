package com.example.fiscalpositionapi.annualRecord.service;

import com.example.fiscalpositionapi.annualRecord.domain.model.entity.AnnualRecord;
import com.example.fiscalpositionapi.annualRecord.domain.persistence.AnnualRecordRepository;
import com.example.fiscalpositionapi.annualRecord.domain.service.AnnualRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnualRecordServiceImpl implements AnnualRecordService {

    @Autowired
    private AnnualRecordRepository annualRecordRepository;

    @Override
    public List<AnnualRecord> getAll() {
        return annualRecordRepository.findAll();
    }

    @Override
    public AnnualRecord create(AnnualRecord annualRecord) {
        return annualRecordRepository.save(annualRecord);
    }

    @Override
    public AnnualRecord update(Long recordId, AnnualRecord annualRecord) {
        return annualRecordRepository.findById(recordId).map(
                annualRecordMap -> annualRecordRepository.save(
                        annualRecordMap.withYear(annualRecord.getYear())
                                .withGdp(annualRecord.getGdp())
                                .withItem(annualRecord.getItem())
                                .withState(annualRecord.getState())
                                .withCategory(annualRecord.getCategory())
                                .withAmount(annualRecord.getAmount())
                )).orElseThrow();
    }

    @Override
    public ResponseEntity<?> delete(Long recordId) {
        return annualRecordRepository.findById(recordId).map(
                annualRecord -> {
                    annualRecordRepository.delete(annualRecord);
                    return ResponseEntity.ok().build();
                }
        ).orElseThrow();
    }
}
