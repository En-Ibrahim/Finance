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
public class Revenus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String r__Name;
    private String r_type;
    private LocalDateTime r_dateTime;
    private double amount;

    @ManyToOne
    private Account account;


}
