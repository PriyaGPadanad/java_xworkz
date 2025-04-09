package com.xworkz.string.internal;

public class WallClock {
    private String brand;
    private boolean isDigital;
    private String shape;

    public WallClock(String brand, boolean isDigital, String shape) {
        this.brand = brand;
        this.isDigital = isDigital;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "WallClock [brand=" + brand + ", digital=" + isDigital + ", shape=" + shape + "]";
    }
}
