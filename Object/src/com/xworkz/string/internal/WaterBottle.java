package com.xworkz.string.internal;

public class WaterBottle {
    private String material;
    private int capacity;
    private boolean isInsulated;

    public WaterBottle(String material, int capacity, boolean isInsulated) {
        this.material = material;
        this.capacity = capacity;
        this.isInsulated = isInsulated;
    }

    @Override
    public String toString() {
        return "WaterBottle [material=" + material + ", capacity=" + capacity + "ml, insulated=" + isInsulated + "]";
    }
}
