package com.xworkz.string.internal;

public class ElectricKettle {
    private String brand;
    private double capacity;
    private boolean autoShutOff;

    public ElectricKettle(String brand, double capacity, boolean autoShutOff) {
        this.brand = brand;
        this.capacity = capacity;
        this.autoShutOff = autoShutOff;
    }

    @Override
    public String toString() {
        return "ElectricKettle [brand=" + brand + ", capacity=" + capacity + "L, autoShutOff=" + autoShutOff + "]";
    }
}
