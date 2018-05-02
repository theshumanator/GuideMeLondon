package com.example.fatoumeh.guidemelondon;

/**
 * Created by fatoumeh on 27/02/2018.
 */

public class Attractions {
    private int name;
    private int address;
    private int cost;
    private int openingHrs;
    private int phone;
    private int imageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Attractions(int name, int address, int cost, int openingHrs, int phone, int imageId) {
        this.name =name;
        this.address = address;
        this.cost = cost;
        this.openingHrs = openingHrs;
        this.phone = phone;
        this.imageId = imageId;
    }



    public int getName() {
        return name;
    }

    public int getAddress() {
        return address;
    }

    public int getCost() {
        return cost;
    }

    public int getOpeningHrs() {
        return openingHrs;
    }

    public int getPhoneNumber() { return phone; }

    public int getImageId() { return imageId;}

    public boolean hasImage() {
        return (imageId != NO_IMAGE_PROVIDED);
    }

}
