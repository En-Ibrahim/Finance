package com.finance.services;


import com.finance.entity.Customer;
import com.finance.exceptions.RecordNotFoundException;
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
            throw new RecordNotFoundException("Not found to update");

        return customerRepo.save(customer);
    }

    public Customer findCustomerByID(Long id) {

        Optional<Customer> entity=customerRepo.findById(id);
        if(entity.isPresent())
            return entity.get();
        else
            throw new RecordNotFoundException("This record id >> "+id+" not found");
    }


    public List<Customer> findAllCustomers() {
        return customerRepo.findAll();
    }

    public void delete(Long id) {
        customerRepo.deleteById(id);
    }

}
