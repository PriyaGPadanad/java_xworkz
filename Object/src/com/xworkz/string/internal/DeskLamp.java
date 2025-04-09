package com.xworkz.string.internal;

public class DeskLamp {
    private String color;
    private boolean isRechargeable;
    private int brightnessLevel;

    public DeskLamp(String color, boolean isRechargeable, int brightnessLevel) {
        this.color = color;
        this.isRechargeable = isRechargeable;
        this.brightnessLevel = brightnessLevel;
    }

    @Override
    public String toString() {
        return "DeskLamp [color=" + color + ", rechargeable=" + isRechargeable + ", brightness=" + brightnessLevel + "]";
    }
}