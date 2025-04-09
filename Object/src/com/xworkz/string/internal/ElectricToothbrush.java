package com.xworkz.string.internal;

public class ElectricToothbrush {
    private String brand;
    private int speedLevels;
    private boolean timer;

    public ElectricToothbrush(String brand, int speedLevels, boolean timer) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.timer = timer;
    }

    @Override
    public String toString() {
        return "ElectricToothbrush [brand=" + brand + ", speeds=" + speedLevels + ", timer=" + timer + "]";
    }
}
