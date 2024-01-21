package de.transaction.repo;

import de.transaction.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<BankAccount, Long> {
    BankAccount findByIban(String iban);
}
