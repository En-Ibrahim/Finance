package com.finance.mapper;


import com.finance.dto.ExpensesDTO;
import com.finance.entity.Expenses;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ExpensesMapper {

    ExpensesMapper MAPPER= Mappers.getMapper(ExpensesMapper.class);

    @Mapping(target = "account.email" , source = "email")
    Expenses mapToEntity (ExpensesDTO expensesDTO);

    @Mapping(target = "email",source = "account.email")
    ExpensesDTO mapToDTO (Expenses expenses);

    List<ExpensesDTO> mapToDTO (List<Expenses> expenses);

}
