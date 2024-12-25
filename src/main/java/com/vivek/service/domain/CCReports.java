package com.vivek.service.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cc_reports")
public class CCReports {
    @Id
    private String id;
    @Column(name="transaction_id")
    private String transactionId;
    @Column(name="bank_application_status")
    private String bankApplicationStatus;
}
