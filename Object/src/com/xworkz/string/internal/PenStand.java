package com.xworkz.string.internal;

public class PenStand {
    private String color;
    private int slots;
    private String shape;

    public PenStand(String color, int slots, String shape) {
        this.color = color;
        this.slots = slots;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "PenStand [color=" + color + ", slots=" + slots + ", shape=" + shape + "]";
    }
}
