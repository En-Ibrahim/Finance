package com.finance.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class RevenusDTO {


    private Long id;

    private String r__Name;
    private String r_type;
    private LocalDateTime r_dateTime;
    private double amount;


    private String email;


}
