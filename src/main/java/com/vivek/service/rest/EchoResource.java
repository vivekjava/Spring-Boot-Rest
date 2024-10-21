package com.vivek.service.rest;

import com.vivek.service.services.MessageService;
import com.vivek.service.services.model.RequestMessage;
import com.vivek.service.services.model.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoResource {
    @Autowired
    MessageService messageService;
    @GetMapping("/message")
    public ResponseMessage getMessage(RequestMessage requestMessage){
        return messageService.mockMessage(requestMessage);
    }
}
