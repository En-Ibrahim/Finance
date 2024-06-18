package com.finance.controller;

import com.finance.entity.Account;
import com.finance.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;


    @PostMapping
    public ResponseEntity<?> addAccount(@RequestBody Account account){
        return ResponseEntity.ok(accountService.insert(account));
    }

    @PutMapping
    public ResponseEntity<?> updateAccount(@RequestBody Account account){
        return ResponseEntity.ok(accountService.update(account));
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(accountService.findAllAccount());
    }

    @GetMapping("/id")
    public ResponseEntity<?> getByID(@Param("id") Long id){
        return ResponseEntity.ok(accountService.findAccountByID(id));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(Long id){
        accountService.delete(id);
        return ResponseEntity.ok(null);
    }

}
