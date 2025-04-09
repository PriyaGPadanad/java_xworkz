package com.xworkz.string.internal;

public class ThermalFlask {
    private String brand;
    private int volume;
    private boolean retainsHeat;

    public ThermalFlask(String brand, int volume, boolean retainsHeat) {
        this.brand = brand;
        this.volume = volume;
        this.retainsHeat = retainsHeat;
    }

    @Override
    public String toString() {
        return "ThermalFlask [brand=" + brand + ", volume=" + volume + "ml, retainsHeat=" + retainsHeat + "]";
    }
}
