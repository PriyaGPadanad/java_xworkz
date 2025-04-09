package com.xworkz.string.internal;

public class AirCooler {
    private String brand;
    private int tankCapacity;
    private boolean hasRemote;

    public AirCooler(String brand, int tankCapacity, boolean hasRemote) {
        this.brand = brand;
        this.tankCapacity = tankCapacity;
        this.hasRemote = hasRemote;
    }

    @Override
    public String toString() {
        return "AirCooler [brand=" + brand + ", tankCapacity=" + tankCapacity + "L, remote=" + hasRemote + "]";
    }
}
