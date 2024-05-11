package com.finance.repo;

import com.finance.entity.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoicesRepo extends JpaRepository<Invoices,Long> {
}
