package com.finance.controller;


import com.finance.entity.Expenses;
import com.finance.services.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    private ExpensesService service;

    @PostMapping
    public ResponseEntity<?> addExpenses(@RequestBody Expenses expenses){
        return ResponseEntity.ok(service.insert(expenses));
    }

    @PutMapping
    public ResponseEntity<?> updateExpenses(@RequestBody Expenses expenses){
        return ResponseEntity.ok(service.update(expenses));
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.findAllExpenses());
    }

    @GetMapping("/id")
    public ResponseEntity<?> getByID(@Param("id") Long id){
        return ResponseEntity.ok(service.findExpensesByID(id));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(Long id){
        service.delete(id);
        return ResponseEntity.ok(null);
    }


}
