package com.finance.dto;

import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccountDTO {

    private Long ID;

    private String email;

    private LocalDateTime dateTime;


    private double balance;

    private String customerName;
}
