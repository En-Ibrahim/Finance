package com.finance.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Entity
public class Account {

    @Id
        private Long ID;

        @Email
        private String email;

        private String password;

        private LocalDateTime dateTime;

        @Min(50)
        private double balance;

        @ManyToOne
        private Customer customer;


}
