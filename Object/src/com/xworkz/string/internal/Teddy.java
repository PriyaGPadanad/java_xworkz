package com.xworkz.string.internal;

public class Teddy {
    private String color;
    private int softnessLevel;
    private boolean isGifted;

    public Teddy(String color, int softnessLevel, boolean isGifted) {
        this.color = color;
        this.softnessLevel = softnessLevel;
        this.isGifted = isGifted;
    }

    @Override
    public String toString() {
        return "Teddy [color=" + color + ", softnessLevel=" + softnessLevel + ", isGifted=" + isGifted + "]";
    }
}
