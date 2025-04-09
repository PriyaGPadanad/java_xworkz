package com.xworkz.string.internal;

public class LuggageBag {
    private String brand;
    private int capacityLiters;
    private boolean hasWheels;

    public LuggageBag(String brand, int capacityLiters, boolean hasWheels) {
        this.brand = brand;
        this.capacityLiters = capacityLiters;
        this.hasWheels = hasWheels;
    }

    @Override
    public String toString() {
        return "LuggageBag [brand=" + brand + ", capacity=" + capacityLiters + "L, wheels=" + hasWheels + "]";
    }
}
