package com.xworkz.string.internal;

public class WaterPurifier {
    private String model;
    private boolean uvTechnology;
    private int filterLife;

    public WaterPurifier(String model, boolean uvTechnology, int filterLife) {
        this.model = model;
        this.uvTechnology = uvTechnology;
        this.filterLife = filterLife;
    }

    @Override
    public String toString() {
        return "WaterPurifier [model=" + model + ", UV=" + uvTechnology + ", filterLife=" + filterLife + " months]";
    }
}
