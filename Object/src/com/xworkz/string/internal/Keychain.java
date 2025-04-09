package com.xworkz.string.internal;

public class Keychain {
    private String shape;
    private String material;
    private boolean hasTorch;

    public Keychain(String shape, String material, boolean hasTorch) {
        this.shape = shape;
        this.material = material;
        this.hasTorch = hasTorch;
    }

    @Override
    public String toString() {
        return "Keychain [shape=" + shape + ", material=" + material + ", hasTorch=" + hasTorch + "]";
    }
}
