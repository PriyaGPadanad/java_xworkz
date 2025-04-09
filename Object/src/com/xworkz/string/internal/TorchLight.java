package com.xworkz.string.internal;

public class TorchLight {
    private String batteryType;
    private int brightnessLumens;
    private boolean isWaterResistant;

    public TorchLight(String batteryType, int brightnessLumens, boolean isWaterResistant) {
        this.batteryType = batteryType;
        this.brightnessLumens = brightnessLumens;
        this.isWaterResistant = isWaterResistant;
    }

    @Override
    public String toString() {
        return "TorchLight [battery=" + batteryType + ", brightness=" + brightnessLumens + "lm, waterResistant=" + isWaterResistant + "]";
    }
}
