package com.finance.mapper;

import com.finance.entity.Account;
import com.finance.dto.AccountDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface AccountMapper {


    @Mapping(target = "customer.name",source = "customerName")
    Account mapToEntity(AccountDTO accountDTO);

    @Mapping(target = "customerName",source = "customer.name")
    AccountDTO mapToDTO (Account account);

    List<AccountDTO> mapToDTO (List<Account> account);

}
