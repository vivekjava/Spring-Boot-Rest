package com.vivek.service.services.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestMessageTest {
    RequestMessage requestMessage;
    String code = "Code";
    String message = "Test Message";
    @BeforeEach
    void setUp() {
        requestMessage = new RequestMessage();
    }

    @Test
    void getCode() {
        requestMessage.setCode(code);
        Assertions.assertEquals(requestMessage.getCode(),"Code");
    }

    @Test
    void getMessage() {
        requestMessage.setMessage(message);
        Assertions.assertEquals(requestMessage.getMessage(),"Test Message");
    }

    @Test
    void setCode() {
        requestMessage.setCode(code);
        Assertions.assertEquals(requestMessage.getCode(),"Code");
    }

    @Test
    void setMessage() {
        requestMessage.setCode(code);
        Assertions.assertEquals(requestMessage.getCode(),"Code");
    }

}