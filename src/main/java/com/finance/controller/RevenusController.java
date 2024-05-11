package com.finance.controller;


import com.finance.entity.Invoices;
import com.finance.entity.Revenus;
import com.finance.services.RevenusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/revenus")
public class RevenusController {


    @Autowired
    private RevenusServices service;


    @PostMapping
    public ResponseEntity<?> addRevenus(@RequestBody Revenus revenus){
        return ResponseEntity.ok(service.insert(revenus));
    }


    @PutMapping
    public ResponseEntity<?> updateRevenus(@RequestBody Revenus revenus){
        return ResponseEntity.ok(service.update(revenus));
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.findAllRevenus());
    }

    @GetMapping("/id")
    public ResponseEntity<?> getByID(@Param("id") Long id){
        return ResponseEntity.ok(service.findRevenusByID(id));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(Long id){
        service.delete(id);
        return ResponseEntity.ok(null);
    }



}
