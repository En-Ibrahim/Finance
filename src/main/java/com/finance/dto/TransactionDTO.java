package com.finance.dto;

import com.finance.entity.Account;
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

public class TransactionDTO {


    private Long id;

    private String type;
    private LocalDateTime dateTime;
    private double amount;


    private String email;


}
