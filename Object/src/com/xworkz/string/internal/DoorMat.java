package com.xworkz.string.internal;

public class DoorMat {
    private String material;
    private String color;
    private boolean isWashable;

    public DoorMat(String material, String color, boolean isWashable) {
        this.material = material;
        this.color = color;
        this.isWashable = isWashable;
    }

    @Override
    public String toString() {
        return "DoorMat [material=" + material + ", color=" + color + ", washable=" + isWashable + "]";
    }
}
