package com.example.fiscalpositionapi.record.domain.persistence;

import com.example.fiscalpositionapi.record.domain.model.entity.AnnualRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnualRecordRepository extends JpaRepository<AnnualRecord, Long> {
}
