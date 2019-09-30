package com.javaminor.accessingDataJPA.Models;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Date;

@MappedSuperclass
public abstract class CredentialsCommon {
    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "CREATED")
    private Date creationDate;

    protected CredentialsCommon() {}

    public CredentialsCommon(String username, String password, Date created){
        this.username = username;
        this.password = password;
        this.creationDate = created;
    }

    //getters and setters

    public Date getCreationDate() {
        return creationDate;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
