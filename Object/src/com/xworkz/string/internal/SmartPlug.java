package com.xworkz.string.internal;

public class SmartPlug {
    private String brand;
    private int maxLoad;
    private boolean voiceControl;

    public SmartPlug(String brand, int maxLoad, boolean voiceControl) {
        this.brand = brand;
        this.maxLoad = maxLoad;
        this.voiceControl = voiceControl;
    }

    @Override
    public String toString() {
        return "SmartPlug [brand=" + brand + ", maxLoad=" + maxLoad + "W, voiceControl=" + voiceControl + "]";
    }
}
