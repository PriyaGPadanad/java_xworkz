package com.xworkz.string.internal;

public class ShoePolish {
    private String color;
    private String brand;
    private boolean isLiquid;

    public ShoePolish(String color, String brand, boolean isLiquid) {
        this.color = color;
        this.brand = brand;
        this.isLiquid = isLiquid;
    }

    @Override
    public String toString() {
        return "ShoePolish [color=" + color + ", brand=" + brand + ", liquid=" + isLiquid + "]";
    }
}
