package com.finance.controller;


import com.finance.entity.Expenses;
import com.finance.entity.Invoices;
import com.finance.services.InvoicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoices")
public class InvoicesController {

    @Autowired
    private InvoicesService service;

    public ResponseEntity<?> addInvoices(@RequestBody Invoices invoices){
        return ResponseEntity.ok(service.insert(invoices));
    }


    @PutMapping
    public ResponseEntity<?> updateInvoices(@RequestBody Invoices invoices){
        return ResponseEntity.ok(service.update(invoices));
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.findAllInvoices());
    }

    @GetMapping("/id")
    public ResponseEntity<?> getByID(@Param("id") Long id){
        return ResponseEntity.ok(service.findInvoicesByID(id));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(Long id){
        service.delete(id);
        return ResponseEntity.ok(null);
    }



}
