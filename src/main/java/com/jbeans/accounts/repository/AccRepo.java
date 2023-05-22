package com.jbeans.accounts.repository;

import com.jbeans.accounts.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccRepo extends CrudRepository<Accounts,Long> {
    Accounts findByCustomerId(int customerId);
}
