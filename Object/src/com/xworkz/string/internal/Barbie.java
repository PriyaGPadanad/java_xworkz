package com.xworkz.string.internal;

public class Barbie {
    private String profession;
    private String outfitColor;
    private boolean hasDreamHouse;

    public Barbie(String profession, String outfitColor, boolean hasDreamHouse) {
        this.profession = profession;
        this.outfitColor = outfitColor;
        this.hasDreamHouse = hasDreamHouse;
    }

    @Override
    public String toString() {
        return "Barbie [profession=" + profession + ", outfitColor=" + outfitColor + ", hasDreamHouse=" + hasDreamHouse + "]";
    }
}

