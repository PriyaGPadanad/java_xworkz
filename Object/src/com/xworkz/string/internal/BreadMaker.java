package com.xworkz.string.internal;

public class BreadMaker {
    private String brand;
    private int loafSize;
    private boolean autoKnead;

    public BreadMaker(String brand, int loafSize, boolean autoKnead) {
        this.brand = brand;
        this.loafSize = loafSize;
        this.autoKnead = autoKnead;
    }

    @Override
    public String toString() {
        return "BreadMaker [brand=" + brand + ", loafSize=" + loafSize + "g, autoKnead=" + autoKnead + "]";
    }
}
