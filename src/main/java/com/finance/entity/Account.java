package com.finance.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
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
        @GeneratedValue(strategy = GenerationType.AUTO)
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
