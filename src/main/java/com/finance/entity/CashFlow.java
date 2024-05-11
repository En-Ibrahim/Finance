package com.finance.entity;


import jakarta.persistence.Entity;
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
@Entity
public class CashFlow {

    @Id
    private Long id;

    private String type;
    private LocalDateTime cf_dateTime;
    @NonNull
    private double amount;

    @ManyToOne
    @NotNull
    private Account account;


}
