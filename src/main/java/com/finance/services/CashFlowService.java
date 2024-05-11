package com.finance.services;

import com.finance.dto.CashFlowDTO;
import com.finance.entity.CashFlow;
import com.finance.mapper.CashFlowMapper;
import com.finance.repo.CashFlowRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CashFlowService {

    @Autowired
    private CashFlowRepo cashFlowRepo;

    private final CashFlowMapper mapper;

    public CashFlowDTO insert(CashFlow cashFlow){
        return mapper.mapToDTO(cashFlowRepo.save(cashFlow));
    }

    public CashFlowDTO getByID(Long id){

        return mapper.mapToDTO(cashFlowRepo.findById(id).orElseThrow()) ;
    }

    public List<CashFlowDTO> getAll(){
        return mapper.mapToDTO(cashFlowRepo.findAll());
    }



}
