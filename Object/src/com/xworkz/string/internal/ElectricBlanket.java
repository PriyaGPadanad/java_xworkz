package com.xworkz.string.internal;

public class ElectricBlanket {
    private String material;
    private int heatLevels;
    private boolean washable;

    public ElectricBlanket(String material, int heatLevels, boolean washable) {
        this.material = material;
        this.heatLevels = heatLevels;
        this.washable = washable;
    }

    @Override
    public String toString() {
        return "ElectricBlanket [material=" + material + ", heatLevels=" + heatLevels + ", washable=" + washable + "]";
    }
}
