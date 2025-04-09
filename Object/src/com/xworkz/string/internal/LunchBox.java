package com.xworkz.string.internal;

public class LunchBox {
    private String brand;
    private int compartments;
    private boolean isMicrowaveSafe;

    public LunchBox(String brand, int compartments, boolean isMicrowaveSafe) {
        this.brand = brand;
        this.compartments = compartments;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return "LunchBox [brand=" + brand + ", compartments=" + compartments + ", microwaveSafe=" + isMicrowaveSafe + "]";
    }
}
