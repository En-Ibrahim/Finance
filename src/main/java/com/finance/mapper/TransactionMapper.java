package com.finance.mapper;

import com.finance.dto.TransactionDTO;
import com.finance.entity.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface TransactionMapper {

    @Mapping(target = "account.email",source = "email")
    Transaction mapToEntity(TransactionDTO transactionDTO);

    @Mapping(target = "email",source = "account.email")
    TransactionDTO mapToDto(Transaction transaction);

    List<TransactionDTO> mapToDto(List<Transaction> transaction);

}
