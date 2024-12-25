package com.vivek.service.rest;

import com.vivek.service.domain.CCReports;
import com.vivek.service.services.CCReportService;
import com.vivek.service.services.dto.CCReportsDTO;
import com.vivek.service.services.impl.CCReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CCReportResources {
    @Autowired
    CCReportService ccReportService;

    @GetMapping("/cc-reports")
    public ResponseEntity<List<CCReportsDTO>> getCCReports(){
        return ResponseEntity.ok(ccReportService.findAll());
    }
}
