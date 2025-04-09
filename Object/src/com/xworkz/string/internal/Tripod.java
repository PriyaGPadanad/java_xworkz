package com.xworkz.string.internal;

public class Tripod {
    private int height;
    private String material;
    private boolean isFlexible;

    public Tripod(int height, String material, boolean isFlexible) {
        this.height = height;
        this.material = material;
        this.isFlexible = isFlexible;
    }

    @Override
    public String toString() {
        return "Tripod [height=" + height + "cm, material=" + material + ", flexible=" + isFlexible + "]";
    }
}
