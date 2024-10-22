package com.vivek.service.rest;

import com.vivek.service.services.MessageService;
import com.vivek.service.services.dto.MessageDTO;
import com.vivek.service.services.impl.MessageServiceImpl;
import com.vivek.service.services.model.RequestMessage;
import com.vivek.service.services.model.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class EchoResource {
    @Autowired
    MessageServiceImpl messageService;
//    public EchoResource(){
//        this.messageService = new MessageServiceImpl();
//    }
    @GetMapping("/message")
    public ResponseEntity getMessage(){
        Map<String,String> map = new HashMap<>();
        map.put("code","SUCCESS_MESSAGE");
        map.put("message","Success");
        return ResponseEntity.ok().body(map);
    }
    @PostMapping("/create")
    public ResponseEntity<MessageDTO> createMessage(RequestMessage requestMessage){        ;
        MessageDTO messageDTO = messageService.saveMessage(new MessageDTO(UUID.randomUUID().toString(),requestMessage.getCode(),requestMessage.getMessage()));
        return ResponseEntity.ok().body(messageDTO);
    }
}
