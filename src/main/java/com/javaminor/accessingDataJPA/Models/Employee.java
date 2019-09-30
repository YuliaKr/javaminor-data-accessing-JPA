package com.javaminor.accessingDataJPA.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Employee extends CredentialsCommon{
    private String jobTitle;

    @Enumerated(EnumType.STRING)
    private GenerEnum gender;

    @Embedded
    private AddressEmbeddable address;

    @OneToMany
    private Collection<BankAccount> managedBankAccounts;

    protected Employee() {};

    public Employee(String jobTitle, GenerEnum gender, AddressEmbeddable address){
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.address = address;
    }
    //getters

    public String getJobTitle() {
        return this.jobTitle;
    }

    public GenerEnum getGener() {
        return this.gender;
    }

    public AddressEmbeddable getAddress() {
        return this.address;
    }

    public Collection<BankAccount> getManagedBankAccounts() {
        return managedBankAccounts;
    }

    public void setManagedBankAccounts(Collection<BankAccount> managedBankAccounts) {
        this.managedBankAccounts = managedBankAccounts;
    }
}
