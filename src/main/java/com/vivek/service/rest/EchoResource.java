package com.vivek.service.rest;

import com.vivek.service.services.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EchoResource {
    @Autowired
    MessageServiceImpl messageService;
    @GetMapping("/message")
    public ResponseEntity getMessage(){
        Map<String,String> map = new HashMap<>();
        map.put("code","SUCCESS_MESSAGE");
        map.put("message","Success");
        return ResponseEntity.ok().body(map);
    }

}
