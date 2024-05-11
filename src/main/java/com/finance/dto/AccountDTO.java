package com.finance.dto;

import com.finance.entity.Customer;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
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
