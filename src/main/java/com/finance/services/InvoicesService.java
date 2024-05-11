package com.finance.services;

import com.finance.dto.InvoicesDTO;
import com.finance.entity.Expenses;
import com.finance.entity.Invoices;
import com.finance.mapper.InvoicesMapper;
import com.finance.repo.ExpensesRepo;
import com.finance.repo.InvoicesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoicesService {

    @Autowired
    private InvoicesRepo invoicesRepo;
    private InvoicesMapper mapper;

    public InvoicesDTO insert(Invoices invoices) {
        return mapper.mapToDto(invoicesRepo.save(invoices));
    }


    public InvoicesDTO update(Invoices invoices) {
        Optional<Invoices> check = invoicesRepo.findById(invoices.getId());

        if (check.isEmpty())
            throw new IllegalArgumentException("Not found to update");

        return mapper.mapToDto(invoicesRepo.save(invoices));
    }

    public InvoicesDTO findInvoicesByID(Long id) {
        return mapper.mapToDto(invoicesRepo.findById(id).orElseThrow());
    }


    public List<InvoicesDTO> findAllInvoices() {
        return mapper.mapToDto(invoicesRepo.findAll());
    }

    public void delete(Long id) {
        invoicesRepo.deleteById(id);
    }

}
