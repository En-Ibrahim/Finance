package com.finance.services;


import com.finance.entity.Customer;
import com.finance.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public Customer insert(Customer customer) {
        if(customer.getId()==null&& customer.getName()==null)
            throw new IllegalArgumentException("Input all rights");
        return customerRepo.save(customer);
    }


    public Customer update(Customer customer){
        Optional<Customer> check = customerRepo.findById(customer.getId());

        if (check.isEmpty())
            throw new IllegalArgumentException("Not found to update");

        return customerRepo.save(customer);
    }

    public Customer findCustomerByID(Long id) {
        return customerRepo.findById(id).orElseThrow();
    }


    public List<Customer> findAllCustomers() {
        return customerRepo.findAll();
    }

    public void delete(Long id) {
        customerRepo.deleteById(id);
    }

}
