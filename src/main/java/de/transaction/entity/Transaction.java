package de.transaction.entity;

import jakarta.persistence.*;

@Entity
@Table(name="transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name="source_account_id")
    @ManyToOne
    private BankAccount sourceAccount;
    @JoinColumn(name="destination_account_id")
    @ManyToOne
    private BankAccount destinationAccount;

    private Long amountInCents;

    @Enumerated
    private Currency currency;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BankAccount getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(BankAccount sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public BankAccount getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(BankAccount destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public Long getAmountInCents() {
        return amountInCents;
    }

    public void setAmountInCents(Long amountInCents) {
        this.amountInCents = amountInCents;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
