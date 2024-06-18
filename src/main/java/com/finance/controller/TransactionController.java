package com.finance.controller;


import com.finance.entity.Transaction;
import com.finance.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController {


    @Autowired
    private TransactionService service;


    @PostMapping
    public ResponseEntity<?> addTransaction(@RequestBody Transaction transaction){
        return ResponseEntity.ok(service.insert(transaction));
    }


    @PutMapping
    public ResponseEntity<?> updateTransaction(@RequestBody Transaction transaction){
        return ResponseEntity.ok(service.update(transaction));
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.findAllTransaction());
    }

    @GetMapping("/id")
    public ResponseEntity<?> getByID(@Param("id") Long id){
        return ResponseEntity.ok(service.findTransactionByID(id));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(Long id){
        service.delete(id);
        return ResponseEntity.ok(null);
    }



}
