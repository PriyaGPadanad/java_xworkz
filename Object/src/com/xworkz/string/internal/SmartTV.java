package com.xworkz.string.internal;

public class SmartTV {
    private String brand;
    private int sizeInches;
    private boolean hasWifi;

    public SmartTV(String brand, int sizeInches, boolean hasWifi) {
        this.brand = brand;
        this.sizeInches = sizeInches;
        this.hasWifi = hasWifi;
    }

    @Override
    public String toString() {
        return "SmartTV [brand=" + brand + ", size=" + sizeInches + "in, hasWifi=" + hasWifi + "]";
    }
}
