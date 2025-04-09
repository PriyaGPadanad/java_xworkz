package com.xworkz.string.internal;

public class Milkshake {
    private String flavor;
    private String size;         // Small, Medium, Large
    private boolean hasWhippedCream;

    public Milkshake(String flavor, String size, boolean hasWhippedCream) {
        this.flavor = flavor;
        this.size = size;
        this.hasWhippedCream = hasWhippedCream;
    }

    @Override
    public String toString() {
        return "Milkshake [flavor=" + flavor + ", size=" + size + ", hasWhippedCream=" + hasWhippedCream + "]";
    }
}
