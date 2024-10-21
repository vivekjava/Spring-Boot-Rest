package com.vivek.service.services;

import com.vivek.service.services.model.RequestMessage;
import com.vivek.service.services.model.ResponseMessage;

public interface MessageService {
    ResponseMessage mockMessage(RequestMessage requestMessage);
}
