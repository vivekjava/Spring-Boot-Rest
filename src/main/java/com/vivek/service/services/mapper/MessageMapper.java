package com.vivek.service.services.mapper;

import com.vivek.service.domain.Message;
import com.vivek.service.services.dto.MessageDTO;
import com.vivek.service.services.model.RequestMessage;
import com.vivek.service.services.model.ResponseMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MessageMapper {
    @Mapping(target = "secretMessage",ignore = true)
    ResponseMessage mapResponse(RequestMessage requestMessage);
    Message toEntity(MessageDTO requestMessage);
    MessageDTO toDTO(Message message);
}
