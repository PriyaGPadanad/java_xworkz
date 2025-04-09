package com.xworkz.string.internal;

public class CeilingFan {
    private String brand;
    private int speedLevels;
    private boolean remoteControl;

    public CeilingFan(String brand, int speedLevels, boolean remoteControl) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.remoteControl = remoteControl;
    }

    @Override
    public String toString() {
        return "CeilingFan [brand=" + brand + ", speedLevels=" + speedLevels + ", remoteControl=" + remoteControl + "]";
    }
}
