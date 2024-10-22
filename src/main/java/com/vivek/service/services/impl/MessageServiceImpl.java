package com.vivek.service.services.impl;

import com.vivek.service.domain.Message;
import com.vivek.service.repository.MessageRepository;
import com.vivek.service.services.MessageService;
import com.vivek.service.services.dto.MessageDTO;
import com.vivek.service.services.mapper.MessageMapper;
import com.vivek.service.services.mapper.MessageMapperImpl;
import com.vivek.service.services.model.RequestMessage;
import com.vivek.service.services.model.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageRepository messageRepository;
    MessageMapper messageMapper ;
    public MessageServiceImpl(){
        messageMapper = new MessageMapperImpl();
    }
    @Override
    public ResponseMessage mockMessage(RequestMessage requestMessage) {
        var result = messageMapper.mapResponse(requestMessage);
        result.setSecretMessage(UUID.randomUUID().toString());
        return result;
    }

    @Override
    public MessageDTO saveMessage(MessageDTO messageDTO) {
        Message message = messageRepository.save(messageMapper.toEntity(messageDTO));
        return messageMapper.toDTO(message);
    }


}
