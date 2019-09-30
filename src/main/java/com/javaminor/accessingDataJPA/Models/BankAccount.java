package com.javaminor.accessingDataJPA.Models;

import javax.persistence.*;

@Entity
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double balance;

    @ManyToOne
    private Employee accountManager;

    protected BankAccount() {}

    public BankAccount (Double balance) {
        this.balance = balance;
    }

    //getters and setters

    public Double getBalance() {
        return balance;
    }

    public Long getId() {
        return id;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Employee getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(Employee accountManager) {
        this.accountManager = accountManager;
    }
}
