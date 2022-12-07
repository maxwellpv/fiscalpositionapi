package com.example.fiscalpositionapi.record.domain.persistence;

import com.example.fiscalpositionapi.record.domain.model.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}
