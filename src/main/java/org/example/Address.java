package org.example;

public class Address {
    private String country;
    private String city;
    private String street;

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }
}
