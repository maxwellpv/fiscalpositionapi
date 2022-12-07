package com.example.fiscalpositionapi.annualRecord.domain.persistence;

import com.example.fiscalpositionapi.annualRecord.domain.model.entity.AnnualRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnualRecordRepository extends JpaRepository<AnnualRecord, Long> {
}
