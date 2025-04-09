package com.xworkz.string.internal;

public class InstantCamera {
    private String brand;
    private String photoSize;
    private boolean hasSelfieMode;

    public InstantCamera(String brand, String photoSize, boolean hasSelfieMode) {
        this.brand = brand;
        this.photoSize = photoSize;
        this.hasSelfieMode = hasSelfieMode;
    }

    @Override
    public String toString() {
        return "InstantCamera [brand=" + brand + ", photoSize=" + photoSize + ", hasSelfieMode=" + hasSelfieMode + "]";
    }
}
