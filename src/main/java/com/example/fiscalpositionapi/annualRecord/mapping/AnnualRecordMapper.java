package com.example.fiscalpositionapi.annualRecord.mapping;

import com.example.fiscalpositionapi.annualRecord.domain.model.entity.AnnualRecord;
import com.example.fiscalpositionapi.annualRecord.resource.CreateAnnualRecordResource;
import com.example.fiscalpositionapi.annualRecord.resource.AnnualRecordResource;
import com.example.fiscalpositionapi.annualRecord.resource.UpdateAnnualRecordResource;
import com.example.fiscalpositionapi.shared.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AnnualRecordMapper {
    @Autowired
    private EnhancedModelMapper mapper;

    public AnnualRecordResource toResource(AnnualRecord model){return mapper.map(model, AnnualRecordResource.class);}

    public List<AnnualRecordResource> toResource(List<AnnualRecord> model){ return mapper.mapList(model, AnnualRecordResource.class);}

    public AnnualRecord toModel(CreateAnnualRecordResource resource) {return mapper.map(resource, AnnualRecord.class);}

    public AnnualRecord toModel(UpdateAnnualRecordResource resource) {return mapper.map(resource, AnnualRecord.class);}

}
