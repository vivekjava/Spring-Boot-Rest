package com.vivek.service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="message")
@Getter
@Setter
@ToString
public class Message {
    @Id
    @Column(name="id")
    private String id;
    @Column(name="code")
    private  String code;
    @Column(name="message")
    private  String message;
}
