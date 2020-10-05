package edu.kavacourse.studentorder.domain;

public class Address {
    private String street;
    private String building;
    private String apartment;

    public Address(String s, String s1, String s2, String s3, String s4) {

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
