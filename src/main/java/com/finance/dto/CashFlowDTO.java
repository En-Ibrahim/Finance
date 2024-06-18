package com.finance.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CashFlowDTO {


    private Long id;

    private String type;
    private LocalDateTime cf_dateTime;
    private double amount;
    private String email;
}
