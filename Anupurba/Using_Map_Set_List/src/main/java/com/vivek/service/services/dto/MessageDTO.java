package com.vivek.service.services.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class MessageDTO {
    private String id;
    private  String code;
    private  String message;
}
