package com.xworkz.string.internal;

public class LaptopStand {
    private String material;
    private boolean isAdjustable;
    private String color;

    public LaptopStand(String material, boolean isAdjustable, String color) {
        this.material = material;
        this.isAdjustable = isAdjustable;
        this.color = color;
    }

    @Override
    public String toString() {
        return "LaptopStand [material=" + material + ", adjustable=" + isAdjustable + ", color=" + color + "]";
    }
}
