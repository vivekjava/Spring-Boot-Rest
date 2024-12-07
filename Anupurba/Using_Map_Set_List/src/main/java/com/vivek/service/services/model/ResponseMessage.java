package com.vivek.service.services.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseMessage {
    private String code;
    private String message;
    private String secretMessage;
}
