package com.xworkz.string.internal;

public class Cushion {
    private String shape;
    private String fabric;
    private boolean isWashable;

    public Cushion(String shape, String fabric, boolean isWashable) {
        this.shape = shape;
        this.fabric = fabric;
        this.isWashable = isWashable;
    }

    @Override
    public String toString() {
        return "Cushion [shape=" + shape + ", fabric=" + fabric + ", isWashable=" + isWashable + "]";
    }

}
