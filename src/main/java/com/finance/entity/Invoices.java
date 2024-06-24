package com.finance.entity;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double total;
    private LocalDateTime dateTime;
    private String status;

    @ManyToOne
    private Account account;

}
