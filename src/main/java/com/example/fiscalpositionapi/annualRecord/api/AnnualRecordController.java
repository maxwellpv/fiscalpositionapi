package com.example.fiscalpositionapi.annualRecord.api;


import com.example.fiscalpositionapi.annualRecord.domain.service.AnnualRecordService;
import com.example.fiscalpositionapi.annualRecord.mapping.AnnualRecordMapper;
import com.example.fiscalpositionapi.annualRecord.resource.AnnualRecordResource;
import com.example.fiscalpositionapi.annualRecord.resource.CreateAnnualRecordResource;
import com.example.fiscalpositionapi.annualRecord.resource.UpdateAnnualRecordResource;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Annual Record")
@RestController
@RequestMapping("api/v1/annual-records")
@CrossOrigin
public class AnnualRecordController {
    @Autowired
    private AnnualRecordService annualRecordService;

    @Autowired
    private AnnualRecordMapper mapper;

    @GetMapping
    public List<AnnualRecordResource> getAll(){
        return mapper.toResource(annualRecordService.getAll());
    }

    @PostMapping
    public AnnualRecordResource createAnnualResource(@RequestBody CreateAnnualRecordResource annualRecordResource){
        return mapper.toResource(annualRecordService.create(mapper.toModel(annualRecordResource)));
    }

    @PutMapping("{annualRecordId}")
    public AnnualRecordResource updateAnnualRecord(@PathVariable Long annualRecordId, @RequestBody UpdateAnnualRecordResource updateAnnualRecordResource){
        return mapper.toResource(annualRecordService.update(annualRecordId, mapper.toModel(updateAnnualRecordResource)));
    }

    @DeleteMapping("{annualRecordId}")
    public ResponseEntity<?> deleteAnnualRecord(@PathVariable Long annualRecordId){
        return annualRecordService.delete(annualRecordId);
    }
}
