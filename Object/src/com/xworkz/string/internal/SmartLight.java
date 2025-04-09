package com.xworkz.string.internal;

public class SmartLight {
    private String brand;
    private boolean colorChange;
    private boolean appControl;

    public SmartLight(String brand, boolean colorChange, boolean appControl) {
        this.brand = brand;
        this.colorChange = colorChange;
        this.appControl = appControl;
    }

    @Override
    public String toString() {
        return "SmartLight [brand=" + brand + ", colorChange=" + colorChange + ", appControl=" + appControl + "]";
    }
}
