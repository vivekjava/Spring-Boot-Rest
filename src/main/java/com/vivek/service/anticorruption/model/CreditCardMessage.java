package com.vivek.service.anticorruption.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreditCardMessage {
    @JsonProperty("transaction_id")
    private String transactionId;
    @JsonProperty("bank_application_status")
    private String bankApplicationStatus;
}
