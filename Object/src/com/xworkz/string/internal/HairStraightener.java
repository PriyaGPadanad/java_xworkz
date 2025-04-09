package com.xworkz.string.internal;

public class HairStraightener {
    private String brand;
    private int tempRange;
    private boolean ceramicCoating;

    public HairStraightener(String brand, int tempRange, boolean ceramicCoating) {
        this.brand = brand;
        this.tempRange = tempRange;
        this.ceramicCoating = ceramicCoating;
    }

    @Override
    public String toString() {
        return "HairStraightener [brand=" + brand + ", temp=" + tempRange + "°C, ceramic=" + ceramicCoating + "]";
    }
}
