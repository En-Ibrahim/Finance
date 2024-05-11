package com.finance.repo;

import com.finance.entity.Revenus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevenusRepo extends JpaRepository<Revenus,Long> {
}
