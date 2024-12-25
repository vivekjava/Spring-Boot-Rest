package com.vivek.service.services.impl;

import com.vivek.service.domain.CCReports;
import com.vivek.service.repository.CCReportsRepository;
import com.vivek.service.services.CCReportService;
import com.vivek.service.services.dto.CCReportsDTO;
import com.vivek.service.services.mapper.CCReportsMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CCReportServiceImpl implements CCReportService {
    CCReportsRepository ccReportsRepository;
    CCReportsMapper ccReportsMapper;
    CCReportServiceImpl(CCReportsRepository ccReportsRepository,CCReportsMapper ccReportsMapper){
        this.ccReportsRepository = ccReportsRepository;
        this.ccReportsMapper = ccReportsMapper;
    }
    @Override
    public List<CCReportsDTO> findAll() {
        List<CCReports> ccReportsDTO = ccReportsRepository.findAll();
        return ccReportsMapper.toDTOList(ccReportsDTO);
    }
}
