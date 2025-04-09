package com.xworkz.string.internal;

public class PowerBank {
    private String brand;
    private int capacityMah;
    private boolean fastCharging;

    public PowerBank(String brand, int capacityMah, boolean fastCharging) {
        this.brand = brand;
        this.capacityMah = capacityMah;
        this.fastCharging = fastCharging;
    }

    @Override
    public String toString() {
        return "PowerBank [brand=" + brand + ", capacity=" + capacityMah + "mAh, fastCharging=" + fastCharging + "]";
    }
}
