package com.xworkz.string.internal;

public class BluetoothSpeaker {
    private String brand;
    private int batteryHours;
    private boolean waterproof;

    public BluetoothSpeaker(String brand, int batteryHours, boolean waterproof) {
        this.brand = brand;
        this.batteryHours = batteryHours;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "BluetoothSpeaker [brand=" + brand + ", battery=" + batteryHours + "h, waterproof=" + waterproof + "]";
    }
}
