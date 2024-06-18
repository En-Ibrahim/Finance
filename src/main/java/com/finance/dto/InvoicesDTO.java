package com.finance.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class InvoicesDTO {


    private Long id;

    private double total;
    private LocalDateTime dateTime;
    private String status;


    private String email;

}
