package com.xworkz.string.internal;

public class WirelessCharger {
    private String brand;
    private int wattage;
    private boolean isFastCharge;

    public WirelessCharger(String brand, int wattage, boolean isFastCharge) {
        this.brand = brand;
        this.wattage = wattage;
        this.isFastCharge = isFastCharge;
    }

    @Override
    public String toString() {
        return "WirelessCharger [brand=" + brand + ", wattage=" + wattage + "W, fastCharge=" + isFastCharge + "]";
    }
}
