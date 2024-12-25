package com.vivek.service.services.mapper;

import com.vivek.service.domain.CCReports;
import com.vivek.service.services.dto.CCReportsDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CCReportsMapper {
    CCReports toEntity(CCReportsDTO ccReportsDTO);
    CCReports toDTO(CCReportsDTO ccReportsDTO);
    List<CCReportsDTO> toDTOList(List<CCReports> ccReportsList);
}
