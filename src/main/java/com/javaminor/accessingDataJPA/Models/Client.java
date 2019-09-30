package com.javaminor.accessingDataJPA.Models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.Collection;

@Entity
public class Client extends CredentialsCommon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private AddressEmbeddable address;

    @OneToMany
    private Collection<BankAccount> bankAccounts;

    protected Client() {};

    public Client(AddressEmbeddable address, CredentialsCommon credentials){
        this.address = address;
        this.setUsername(credentials.getUsername());
        this.setPassword(credentials.getPassword());
        this.setCreationDate(new Date(Calendar.getInstance().getTime().getTime()));
    }

    //getters

    public Long getId() {
        return this.id;
    }

    public AddressEmbeddable getAddress() {
        return this.address;
    }

    public Collection<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(Collection<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
