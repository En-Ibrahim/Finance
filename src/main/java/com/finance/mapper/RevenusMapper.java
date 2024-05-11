package com.finance.mapper;

import com.finance.dto.InvoicesDTO;
import com.finance.dto.RevenusDTO;
import com.finance.entity.Invoices;
import com.finance.entity.Revenus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface RevenusMapper {

    @Mapping(target = "account.email",source = "email")
    Revenus mapToEntity(RevenusDTO invoicesDTO);

    @Mapping(target = "email",source = "account.email")
    RevenusDTO mapToDto(Revenus revenus);

    List<RevenusDTO> mapToDto(List<Revenus> invoices);



}
