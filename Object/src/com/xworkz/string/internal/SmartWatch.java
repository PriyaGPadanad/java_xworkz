package com.xworkz.string.internal;

public class SmartWatch {
    private String brand;
    private boolean gps;
    private int batteryLife;

    public SmartWatch(String brand, boolean gps, int batteryLife) {
        this.brand = brand;
        this.gps = gps;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "SmartWatch [brand=" + brand + ", GPS=" + gps + ", battery=" + batteryLife + "h]";
    }
}
