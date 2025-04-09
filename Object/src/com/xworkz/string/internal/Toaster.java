package com.xworkz.string.internal;

public class Toaster {
    private String brand;
    private int sliceCapacity;
    private boolean defrostMode;

    public Toaster(String brand, int sliceCapacity, boolean defrostMode) {
        this.brand = brand;
        this.sliceCapacity = sliceCapacity;
        this.defrostMode = defrostMode;
    }

    @Override
    public String toString() {
        return "Toaster [brand=" + brand + ", sliceCapacity=" + sliceCapacity + ", defrostMode=" + defrostMode + "]";
    }
}
