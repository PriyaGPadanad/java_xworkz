package com.xworkz.string.internal;

public class ElectricIron {
    private String brand;
    private int powerWatts;
    private boolean steamEnabled;

    public ElectricIron(String brand, int powerWatts, boolean steamEnabled) {
        this.brand = brand;
        this.powerWatts = powerWatts;
        this.steamEnabled = steamEnabled;
    }

    @Override
    public String toString() {
        return "ElectricIron [brand=" + brand + ", power=" + powerWatts + "W, steamEnabled=" + steamEnabled + "]";
    }
}
