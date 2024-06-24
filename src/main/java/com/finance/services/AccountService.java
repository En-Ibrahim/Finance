package com.finance.services;

import com.finance.dto.AccountDTO;
import com.finance.entity.Account;
import com.finance.exceptions.DublicateErrorException;
import com.finance.exceptions.RecordNotFoundException;
import com.finance.mapper.AccountMapper;
import com.finance.repo.AccountRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {

    @Autowired
    private AccountRepo accountRepo;



    private final AccountMapper accountMapper;


    public AccountDTO insert(Account account) {

        if(!account.getEmail().isEmpty()&&account.getEmail()!=null){
            Optional<Account> entity= accountRepo.findByEmail(account.getEmail());
            if(entity.isPresent())
                throw new DublicateErrorException("This email is already used ");

        }
        account.setDateTime(LocalDateTime.now());
        accountRepo.save(account);
        AccountDTO dto= accountMapper.mapToDTO(account);
        return dto;
    }


    public AccountDTO update(Account account) {
        Optional<Account> check = accountRepo.findById(account.getID());
        if (check.isEmpty())
            throw new RecordNotFoundException("Not found to update");

        AccountDTO dto = accountMapper.mapToDTO(account);
        accountRepo.save(account);
        return dto;
    }

    public AccountDTO findAccountByID(Long id) {
        Optional<Account> entity =accountRepo.findById(id);
        if(entity.isEmpty()&&entity==null)
            throw new RecordNotFoundException("Not found account id >> "+id);

        return accountMapper.mapToDTO(entity.get()) ;
    }
    public Optional<Account> findByEmail(String email){
        return accountRepo.findByEmail(email);
    }


    public List<AccountDTO> findAllAccount() {
        return accountMapper.mapToDTO(accountRepo.findAll());
    }

    public void delete(Long id) {
        Optional<Account> entity =accountRepo.findById(id);
        if(entity.isEmpty()&&entity==null)
            throw new RecordNotFoundException("this account id >> "+id+" already deleted");
        accountRepo.deleteById(id);
    }

}
