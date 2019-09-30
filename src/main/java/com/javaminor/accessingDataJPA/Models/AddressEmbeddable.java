package com.javaminor.accessingDataJPA.Models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AddressEmbeddable {

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;

    @Column(name = "ZIPCODE")
    private String zipcode;

    @Column(name = "STREET")
    private String street;

    @Column(name = "HOUSE_NUMBER")
    private String houseNumber;
}
