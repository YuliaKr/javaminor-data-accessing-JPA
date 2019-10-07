package com.javaminor.accessingDataJPA.Models.DbModels;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AddressEmbeddable {

    @Column(name = "COUNTRY", nullable = false)
    private String country;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "ZIPCODE", nullable = false)
    private String zipcode;

    @Column(name = "STREET", nullable = false)
    private String street;

    @Column(name = "HOUSE_NUMBER", nullable = false)
    private String houseNumber;

    @Column(name = "HOUSE_NUMBER_ADDITION", nullable = true)
    private String houseNumberAddition;

    protected  AddressEmbeddable() {}

    public AddressEmbeddable (String country, String city, String zipcode, String street, String houseNumber, String houseNumberAddition) {
        this.country = country;
        this.city = city;
        this.zipcode = zipcode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.houseNumberAddition = houseNumberAddition;
    }

    //getters and setters
    public String getCity() {
        return city;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getHouseNumberAddition() {
        return houseNumberAddition;
    }

    public void setHouseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
    }
}
