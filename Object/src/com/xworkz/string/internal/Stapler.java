package com.xworkz.string.internal;

public class Stapler {
    private String brand;
    private int stapleCapacity;
    private boolean isHeavyDuty;

    public Stapler(String brand, int stapleCapacity, boolean isHeavyDuty) {
        this.brand = brand;
        this.stapleCapacity = stapleCapacity;
        this.isHeavyDuty = isHeavyDuty;
    }

    @Override
    public String toString() {
        return "Stapler [brand=" + brand + ", capacity=" + stapleCapacity + ", heavyDuty=" + isHeavyDuty + "]";
    }
}
