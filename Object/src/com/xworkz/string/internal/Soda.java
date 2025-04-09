package com.xworkz.string.internal;

public class Soda {
    private String brand;
    private String flavor;
    private int volumeInMl;

    public Soda(String brand, String flavor, int volumeInMl) {
        this.brand = brand;
        this.flavor = flavor;
        this.volumeInMl = volumeInMl;
    }

    @Override
    public String toString() {
        return "Soda [brand=" + brand + ", flavor=" + flavor + ", volume=" + volumeInMl + "ml]";
    }
}
