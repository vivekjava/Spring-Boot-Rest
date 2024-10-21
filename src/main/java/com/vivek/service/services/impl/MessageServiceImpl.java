package com.vivek.service.services.impl;

import com.vivek.service.services.MessageService;
import com.vivek.service.services.mapper.MessageMapper;
import com.vivek.service.services.model.RequestMessage;
import com.vivek.service.services.model.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;
    @Override
    public ResponseMessage mockMessage(RequestMessage requestMessage) {
        var result = messageMapper.mapResponse(requestMessage);
        result.setSecretMessage(UUID.randomUUID().toString());
        return result;
    }
}
