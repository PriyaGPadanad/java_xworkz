package com.xworkz.string.internal;

public class Microwave {
    private String brand;
    private int powerWatts;
    private boolean hasGrillFunction;

     public Microwave(String brand,int powerWatts,boolean hasGrillFunction){
        this.brand=brand;
        this.powerWatts=powerWatts;
        this.hasGrillFunction=hasGrillFunction;
    }

    @Override
    public String toString() {
        return "Microwave [brand=" + brand + "," + " power=" + powerWatts + "W, grillFunction=" + hasGrillFunction + "]";
    }
}
