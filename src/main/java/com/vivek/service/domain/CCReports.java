package com.vivek.service.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@Entity
@Table(name="cc_reports")
public class CCReports {
    @Id
    @GeneratedValue(generator = "uuid-hibernate-generator")
    @GenericGenerator(name = "uuid-hibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column(name="transaction_id")
    private String transactionId;
    @Column(name="bank_application_status")
    private String bankApplicationStatus;
}
