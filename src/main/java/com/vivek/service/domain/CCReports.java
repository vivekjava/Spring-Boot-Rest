package com.vivek.service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cc_reports")
public class CCReports {
    @Id
    @Column
    private Long id;
    @Column(name="transaction_id")
    private String transactionId;
}
