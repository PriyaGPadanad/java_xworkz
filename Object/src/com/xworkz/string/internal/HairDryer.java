package com.xworkz.string.internal;

public class HairDryer {
    private String brand;
    private int heatSettings;
    private boolean coolShotAvailable;

    public HairDryer(String brand, int heatSettings, boolean coolShotAvailable) {
        this.brand = brand;
        this.heatSettings = heatSettings;
        this.coolShotAvailable = coolShotAvailable;
    }

    @Override
    public String toString() {
        return "HairDryer [brand=" + brand + ", heatSettings=" + heatSettings + ", coolShot=" + coolShotAvailable + "]";
    }
}
