package com.example.fiscalpositionapi.record.domain.service;

import com.example.fiscalpositionapi.record.domain.model.entity.Record;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RecordService {
    List<Record> getAll();
    Record create(Record record);
    Record update(Long recordId, Record record);
    ResponseEntity<?> delete(Long recordId);
}
