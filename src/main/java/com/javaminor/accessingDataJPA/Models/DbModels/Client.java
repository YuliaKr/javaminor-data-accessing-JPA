package com.javaminor.accessingDataJPA.Models.DbModels;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.Collection;

@Entity
public class Client extends CredentialsCommon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENT_ID")
    private Long id;

    @Embedded
    private AddressEmbeddable address;

    @OneToMany
    @JoinColumn(name = "ACCOUNT_ID")
    private Collection<BankAccount> bankAccounts;

    protected Client() {};

    public Client(AddressEmbeddable address, String username, String password){
        this.address = address;
        this.setUsername(username);
        this.setPassword(password);
        this.setCreationDate(new Date(Calendar.getInstance().getTime().getTime()));
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, username='%s', password='%s']",
                id, getUsername(), getPassword());
    }
    //getters and setters

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

    public void setAddress(AddressEmbeddable address) {
        this.address = address;
    }
}
