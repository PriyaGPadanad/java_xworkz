package com.xworkz.string.internal;

public class Backpack {
    private String brand;
    private int compartments;
    private boolean hasLaptopSleeve;

    public Backpack(String brand, int compartments, boolean hasLaptopSleeve) {
        this.brand = brand;
        this.compartments = compartments;
        this.hasLaptopSleeve = hasLaptopSleeve;
    }

    @Override
    public String toString() {
        return "Backpack [brand=" + brand + ", compartments=" + compartments + ", hasLaptopSleeve=" + hasLaptopSleeve + "]";
    }
}
