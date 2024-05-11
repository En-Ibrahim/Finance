package com.finance.mapper;

import com.finance.dto.CashFlowDTO;
import com.finance.entity.CashFlow;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface CashFlowMapper {

    @Mapping(target = "email",source = "account.email")
    CashFlowDTO mapToDTO(CashFlow cashFlow);

    List<CashFlowDTO> mapToDTO(List<CashFlow> cashFlow);


    @Mapping(target = "account.email",source = "email")
    CashFlow mapToEntity(CashFlowDTO cashFlowDTO);



}
