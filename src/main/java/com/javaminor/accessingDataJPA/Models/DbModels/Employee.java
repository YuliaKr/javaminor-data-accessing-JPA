package com.javaminor.accessingDataJPA.Models.DbModels;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Employee extends CredentialsCommon{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MANAGER_ID")
    private Long id;

    @Column(name = "JOB_TITLE", nullable = false)
    private String jobTitle;

    @Enumerated(EnumType.STRING)
    @Column(name = "GENDER")
    private GenderEnum gender;

    @Embedded
    private AddressEmbeddable address;

    @OneToMany
    private Collection<BankAccount> managedBankAccounts;

    protected Employee() {};

    public Employee(String jobTitle, GenderEnum gender, AddressEmbeddable address){
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.address = address;
    }
    //getters and setters

    public String getJobTitle() {
        return this.jobTitle;
    }

    public GenderEnum getGender() {
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

    public Long getId() {
        return id;
    }
}
