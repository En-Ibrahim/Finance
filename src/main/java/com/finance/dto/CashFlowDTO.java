package com.finance.dto;

import com.finance.entity.Account;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.lang.NonNull;

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
