package com.xworkz.string.internal;

public class Dishwasher {
    private String brand;
    private int racks;
    private boolean hasDryer;

    public Dishwasher(String brand, int racks, boolean hasDryer) {
        this.brand = brand;
        this.racks = racks;
        this.hasDryer = hasDryer;
    }

    @Override
    public String toString() {
        return "Dishwasher [brand=" + brand + ", racks=" + racks + ", dryer=" + hasDryer + "]";
    }
}
