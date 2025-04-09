package com.xworkz.string.internal;

public class Toothbrush {
    private String brand;
    private boolean isElectric;
    private String color;

    public Toothbrush(String brand, boolean isElectric, String color) {
        this.brand = brand;
        this.isElectric = isElectric;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Toothbrush [brand=" + brand + ", electric=" + isElectric + ", color=" + color + "]";
    }
}
