package com.finance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Transaction {

    @Id
    private Long id;

    private String type;
    private LocalDateTime dateTime;
    private double amount;

    @ManyToOne
    private Account account;


}
