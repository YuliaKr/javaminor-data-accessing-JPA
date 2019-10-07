package com.javaminor.accessingDataJPA.Models.DbModels;

import javax.persistence.*;

@Entity
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ACCOUNT_ID", nullable = false)
    private Long id;

    @Column(name="BALANCE", nullable = false)
    private Double balance;

    @ManyToOne
    @JoinColumn(name = "MANAGER_ID")
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
