package com.vivek.service.rest;

import com.vivek.service.domain.CCReports;
import com.vivek.service.repository.CCReportsRepository;
import com.vivek.service.services.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StatusResource {
    @Autowired
    CCReportsRepository ccReportsRepository;
    @Autowired
    MessageServiceImpl messageService;
    @GetMapping("/status")
    public ResponseEntity getMessage(){
        Map<String,Object> map = new HashMap<>();
        map.put("code", HttpStatus.OK.value());
        map.put("message","Service is running");
        return ResponseEntity.ok().body(map);
    }

}
