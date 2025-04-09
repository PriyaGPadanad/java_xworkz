package com.xworkz.string.internal;

public class Sanitizer {
    private String brand;
    private int volumeML;
    private boolean alcoholBased;

    public Sanitizer(String brand, int volumeML, boolean alcoholBased) {
        this.brand = brand;
        this.volumeML = volumeML;
        this.alcoholBased = alcoholBased;
    }



    @Override
    public String toString() {
        return "HandSanitizer [brand=" + brand + ", volume=" + volumeML + "ml, alcoholBased=" + alcoholBased + "]";
    }

}
