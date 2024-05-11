package com.finance.repo;

import com.finance.entity.CashFlow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashFlowRepo extends JpaRepository<CashFlow,Long> {
}
