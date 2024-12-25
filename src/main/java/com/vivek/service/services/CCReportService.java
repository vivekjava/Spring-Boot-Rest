package com.vivek.service.services;

import com.vivek.service.services.dto.CCReportsDTO;

import java.util.List;

public interface CCReportService {
    List<CCReportsDTO> findAll();
}
