package com.finance.repo;

import com.finance.entity.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpensesRepo extends JpaRepository<Expenses,Long> {


}
