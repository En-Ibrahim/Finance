package com.finance.services;

import com.finance.dto.TransactionDTO;
import com.finance.entity.Transaction;
import com.finance.mapper.TransactionMapper;
import com.finance.repo.TransactionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionService {

    @Autowired
    private TransactionRepo transactionRepo;
    private final TransactionMapper mapper;

    public TransactionDTO insert(Transaction transaction) {
        return mapper.mapToDto(transactionRepo.save(transaction));
    }


    public TransactionDTO update(Transaction transaction) {
        Optional<Transaction> check = transactionRepo.findById(transaction.getId());

        if (check.isEmpty())
            throw new IllegalArgumentException("Not found to update");

        return mapper.mapToDto(transactionRepo.save(transaction));
    }

    public TransactionDTO findTransactionByID(Long id) {
        return mapper.mapToDto(transactionRepo.findById(id).orElseThrow());
    }


    public List<TransactionDTO> findAllTransaction() {
        return mapper.mapToDto(transactionRepo.findAll());
    }

    public void delete(Long id) {
        transactionRepo.deleteById(id);
    }

}
