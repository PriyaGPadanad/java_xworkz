package com.xworkz.string.internal;

public class DeskClock {
    private String type; // analog or digital
    private String brand;
    private boolean hasAlarm;

    public DeskClock(String type, String brand, boolean hasAlarm) {
        this.type = type;
        this.brand = brand;
        this.hasAlarm = hasAlarm;
    }

    @Override
    public String toString() {
        return "DeskClock [type=" + type + ", brand=" + brand + ", hasAlarm=" + hasAlarm + "]";
    }
}
