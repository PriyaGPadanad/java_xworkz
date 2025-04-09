package com.xworkz.string.internal;

public class DishDryer {
    private String brand;
    private int capacityPlates;
    private boolean hasHeater;

    public DishDryer(String brand, int capacityPlates, boolean hasHeater) {
        this.brand = brand;
        this.capacityPlates = capacityPlates;
        this.hasHeater = hasHeater;
    }

    @Override
    public String toString() {
        return "DishDryer [brand=" + brand + ", capacity=" + capacityPlates + " plates, heater=" + hasHeater + "]";
    }
}
