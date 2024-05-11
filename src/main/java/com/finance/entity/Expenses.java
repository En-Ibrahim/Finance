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
public class Expenses {

    @Id
    private Long id;

    private String E_Name;
    private LocalDateTime e_dateTime;
    private double amount;

    @ManyToOne
    private Account account;


}
