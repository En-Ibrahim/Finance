package com.finance.services;

import com.finance.dto.AccountDTO;
import com.finance.entity.Account;
import com.finance.mapper.AccountMapper;
import com.finance.repo.AccountRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {

    @Autowired
    private AccountRepo accountRepo;



    private final AccountMapper accountMapper;


    public AccountDTO insert(Account account) {
        AccountDTO dto= accountMapper.mapToDTO(account);
        accountRepo.save(account);
        return dto;
    }


    public AccountDTO update(Account account) {
        Optional<Account> check = accountRepo.findById(account.getID());
        if (check.isEmpty())
            throw new IllegalArgumentException("Not found to update");

        AccountDTO dto = accountMapper.mapToDTO(account);
        accountRepo.save(account);
        return dto;
    }

    public AccountDTO findAccountByID(Long id) {

        return accountMapper.mapToDTO(accountRepo.findById(id).orElseThrow()) ;
    }


    public List<AccountDTO> findAllAccount() {
        return accountMapper.mapToDTO(accountRepo.findAll());
    }

    public void delete(Long id) {
        accountRepo.deleteById(id);
    }

}
