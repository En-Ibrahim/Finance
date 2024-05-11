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
public class Invoices {

    @Id
    private Long id;

    private double total;
    private LocalDateTime dateTime;
    private String status;

    @ManyToOne
    private Account account;

}
