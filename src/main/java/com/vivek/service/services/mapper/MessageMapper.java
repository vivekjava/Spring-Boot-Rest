package com.vivek.service.services.mapper;

import com.vivek.service.services.model.RequestMessage;
import com.vivek.service.services.model.ResponseMessage;
import org.mapstruct.Mapper;

@Mapper
public interface MessageMapper {
    ResponseMessage mapResponse(RequestMessage requestMessage);
}
