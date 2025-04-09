package com.xworkz.string.internal;

public class RiceCooker {
    private String brand;
    private double capacity;
    private boolean keepWarm;

    public RiceCooker(String brand, double capacity, boolean keepWarm) {
        this.brand = brand;
        this.capacity = capacity;
        this.keepWarm = keepWarm;
    }

    @Override
    public String toString() {
        return "RiceCooker [brand=" + brand + ", capacity=" + capacity + "L, keepWarm=" + keepWarm + "]";
    }
}
