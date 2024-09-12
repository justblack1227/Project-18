package org.yoursfirst.YoursRest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yoursfirst.YoursRest.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

    Optional<Account> findByEmail(String email);
    
}
