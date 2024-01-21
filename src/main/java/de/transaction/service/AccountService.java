package de.transaction.service;

import de.transaction.entity.BankAccount;
import de.transaction.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public BankAccount findByIban(String iban) {
        return accountRepository.findByIban(iban);
    }

}
