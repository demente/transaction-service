package de.transaction.controller;

import de.transaction.dto.TransactionInput;
import de.transaction.entity.Transaction;
import de.transaction.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping(name = "book", method = RequestMethod.POST, path = "book")
    @PostMapping
    public ResponseEntity<Transaction> book(@Valid @RequestBody TransactionInput input) {
        Transaction transaction = transactionService.bookTransaction(input);
        return new ResponseEntity<>(transaction, HttpStatus.OK);
    }

    @RequestMapping(name = "rollback", method = RequestMethod.POST, path = "rollback")
    @PostMapping
    public ResponseEntity rollback(@Valid @RequestParam Long transactionId) {
        transactionService.rollback(transactionId);
        return new ResponseEntity<>(null, HttpStatus.OK);

    }

    @RequestMapping(name = "list", method = RequestMethod.GET, path = "list")
    @GetMapping
    public ResponseEntity<List<Transaction>> list(@AuthenticationPrincipal User user) {
        List<Transaction> list = transactionService.listTransactions();
        return new ResponseEntity<List<Transaction>>(list, HttpStatus.OK);
    }

}
