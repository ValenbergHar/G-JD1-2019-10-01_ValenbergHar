package edu.kavacourse.studentorder.domain;

public class Address {
    private String postCode;
    private Street street;
    private String building;
    private String extention;
    private String apartment;

    public Address(String postCode, Street street, String building, String extention, String apartment) {
        this.postCode = postCode;
        this.street = street;
        this.building = building;
        this.extention = extention;
        this.apartment = apartment;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getExtension() {
        return extention;
    }

    public void setExtension(String extention) {
        this.extention = extention;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }


}
