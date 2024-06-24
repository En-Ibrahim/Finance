package com.finance.services;

import com.finance.dto.ExpensesDTO;
import com.finance.entity.Expenses;
import com.finance.exceptions.RecordNotFoundException;
import com.finance.mapper.ExpensesMapper;
import com.finance.repo.ExpensesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExpensesService {

    @Autowired
    private ExpensesRepo expensesRepo;
    private final ExpensesMapper mapper;

    public ExpensesDTO insert(Expenses expenses) {
        return mapper.mapToDTO(expensesRepo.save(expenses));
    }


    public ExpensesDTO update(Expenses expenses) {
        Optional<Expenses> check = expensesRepo.findById(expenses.getId());

        if (check.isEmpty())
            throw new RecordNotFoundException("Not found to update");

        return mapper.mapToDTO(expensesRepo.save(expenses));
    }

    public ExpensesDTO findExpensesByID(Long id) {
        Optional<Expenses> expenses =expensesRepo.findById(id);
        if(expenses.isEmpty()&& expenses==null)
            throw new RecordNotFoundException("Not found expenses");

        return mapper.mapToDTO(expenses.get());
    }


    public List<ExpensesDTO> findAllExpenses() {
        return mapper.mapToDTO(expensesRepo.findAll());
    }

    public void delete(Long id) {
        expensesRepo.deleteById(id);
    }

}
