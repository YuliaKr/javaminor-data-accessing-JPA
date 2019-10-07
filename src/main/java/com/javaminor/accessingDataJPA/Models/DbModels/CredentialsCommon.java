package com.javaminor.accessingDataJPA.Models.DbModels;

import javax.persistence.*;
import java.sql.Date;

@MappedSuperclass
public abstract class CredentialsCommon {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "userId-generator")
    @TableGenerator(name = "userId-generator", table = "userIds")
    private Long id;

    @Version
    private Long version;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "CREATED")
    private Date creationDate;

    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
