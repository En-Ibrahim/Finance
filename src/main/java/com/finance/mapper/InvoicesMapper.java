package com.finance.mapper;

import com.finance.dto.InvoicesDTO;
import com.finance.entity.Invoices;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.lang.annotation.Target;
import java.util.List;

@Mapper
public interface InvoicesMapper {

    @Mapping(target = "account.email",source="email")
    Invoices mapToEntity(InvoicesDTO invoicesDTO);
    @Mapping(target = "email",source = "account.email")
    InvoicesDTO mapToDto(Invoices invoices);

    List<InvoicesDTO> mapToDto(List<Invoices> invoices);
}
