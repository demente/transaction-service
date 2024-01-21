package de.transaction.service;

import de.transaction.dto.TransactionInput;
import de.transaction.entity.BankAccount;
import de.transaction.entity.Transaction;
import de.transaction.repo.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private AccountService accountService;

    public Transaction bookTransaction(TransactionInput input) {
        BankAccount destination = accountService.findByIban(input.getDestinationIban());
        BankAccount source = accountService.findByIban(input.getSourceIban());
        return transactionRepository.save(new Transaction(source,
                destination, input.getAmount(), input.getCurrency()));
    }

    public void rollback(Long transactionId) {
        transactionRepository.deleteById(transactionId);
    }

    public List<Transaction> listTransactions() {
        return transactionRepository.findAll();
    }
}
