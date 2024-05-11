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
public class Revenus {

    @Id
    private Long id;

    private String r__Name;
    private String r_type;
    private LocalDateTime r_dateTime;
    private double amount;

    @ManyToOne
    private Account account;


}
