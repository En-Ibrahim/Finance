package com.finance.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExpensesDTO {

    private Long id;

    private String E_Name;
    private LocalDateTime e_dateTime;
    private double amount;
    private String email;

}
