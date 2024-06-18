package com.finance.services;

import com.finance.dto.RevenusDTO;
import com.finance.entity.Revenus;
import com.finance.mapper.RevenusMapper;
import com.finance.repo.RevenusRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RevenusServices {

    @Autowired
    private RevenusRepo revenusRepo;
    private final RevenusMapper mapper;

    public RevenusDTO insert(Revenus revenus) {
        return mapper.mapToDto(revenusRepo.save(revenus)) ;
    }


    public RevenusDTO update(Revenus revenus) {
        Optional<Revenus> check = revenusRepo.findById(revenus.getId());

        if (check.isEmpty())
            throw new IllegalArgumentException("Not found to update");

        return mapper.mapToDto(revenusRepo.save(revenus));
    }

    public RevenusDTO findRevenusByID(Long id) {
        return mapper.mapToDto(revenusRepo.findById(id).orElseThrow());
    }


    public List<RevenusDTO> findAllRevenus() {
        return mapper.mapToDto(revenusRepo.findAll());
    }

    public void delete(Long id) {
        revenusRepo.deleteById(id);
    }

}
