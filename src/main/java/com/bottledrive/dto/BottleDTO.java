package com.bottledrive.dto;

public class BottleDTO {
    private String address;
    private int numberOfBottles;

    // Constructors, getters, and setters
    public BottleDTO() {
    }

    public BottleDTO(String address, int numberOfBottles) {
        this.address = address;
        this.numberOfBottles = numberOfBottles;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfBottles() {
        return numberOfBottles;
    }

    public void setNumberOfBottles(int numberOfBottles) {
        this.numberOfBottles = numberOfBottles;
    }
}
