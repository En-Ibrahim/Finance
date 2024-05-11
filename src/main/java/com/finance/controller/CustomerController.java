package com.finance.controller;

import com.finance.entity.Customer;
import com.finance.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

        @Autowired
        private CustomerService customerService;


        @PostMapping()
        public ResponseEntity<?> insert(@RequestBody Customer customer){
                return ResponseEntity.ok(customerService.insert(customer));
        }
        @PutMapping
        public ResponseEntity<?> update(@RequestBody Customer customer)  {
                return ResponseEntity.ok(customerService.update(customer));
        }

        @GetMapping("/id")
        public ResponseEntity<?> findCustomerByID(@Param("id") Long id) {
                return ResponseEntity.ok( customerService.findCustomerByID(id));
        }

        @GetMapping
        public ResponseEntity<?> findAllCustomers() {
                return ResponseEntity.ok( customerService.findAllCustomers());
        }

        @DeleteMapping
        public ResponseEntity<?> delete(Long id) {
                customerService.delete(id);
                return  ResponseEntity.ok(null);
        }


}
