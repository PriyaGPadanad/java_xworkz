package com.xworkz.string.internal;

public class InductionStove {
    private String brand;
    private int powerWatts;
    private boolean autoSwitchOff;

    public InductionStove(String brand, int powerWatts, boolean autoSwitchOff) {
        this.brand = brand;
        this.powerWatts = powerWatts;
        this.autoSwitchOff = autoSwitchOff;
    }

    @Override
    public String toString() {
        return "InductionStove [brand=" + brand + ", power=" + powerWatts + "W, autoSwitchOff=" + autoSwitchOff + "]";
    }
}
