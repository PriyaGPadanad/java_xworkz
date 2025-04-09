package com.xworkz.string.internal;

public class Sneakers {
    private String brand;
    private int size;
    private boolean isWaterproof;

    public Sneakers(String brand, int size, boolean isWaterproof) {
        this.brand = brand;
        this.size = size;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "Sneakers [brand=" + brand + ", size=" + size + ", waterproof=" + isWaterproof + "]";
    }
}
