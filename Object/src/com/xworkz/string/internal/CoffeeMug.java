package com.xworkz.string.internal;

public class CoffeeMug {
    private String color;
    private int capacityInMl;
    private boolean isMicrowaveSafe;

    public CoffeeMug(String color, int capacityInMl, boolean isMicrowaveSafe) {
        this.color = color;
        this.capacityInMl = capacityInMl;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return "CoffeeMug [color=" + color + ", capacity=" + capacityInMl + "ml, microwaveSafe=" + isMicrowaveSafe + "]";
    }
}
