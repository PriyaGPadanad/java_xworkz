package com.xworkz.string.internal;

public class MixerGrinder {
    private String brand;
    private int jars;
    private boolean hasJuicer;

    public MixerGrinder(String brand, int jars, boolean hasJuicer) {
        this.brand = brand;
        this.jars = jars;
        this.hasJuicer = hasJuicer;
    }

    @Override
    public String toString() {
        return "MixerGrinder [brand=" + brand + ", jars=" + jars + ", hasJuicer=" + hasJuicer + "]";
    }
}
