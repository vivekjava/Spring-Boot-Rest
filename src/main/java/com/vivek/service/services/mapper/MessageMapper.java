package com.vivek.service.services.mapper;

import com.vivek.service.services.model.RequestMessage;
import com.vivek.service.services.model.ResponseMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MessageMapper {
    @Mapping(target = "secretMessage",ignore = true)
    ResponseMessage mapResponse(RequestMessage requestMessage);
}
