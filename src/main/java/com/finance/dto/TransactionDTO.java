package com.finance.dto;

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
