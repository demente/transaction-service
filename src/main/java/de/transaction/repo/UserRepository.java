package de.transaction.repo;

import de.transaction.entity.BankUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<BankUser, Long> {

    public BankUser findByUsername(String username);
}
