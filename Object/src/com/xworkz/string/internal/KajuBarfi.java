package com.xworkz.string.internal;

public class KajuBarfi {
    private String shape;
    private int weightInGrams;
    private boolean hasSilverFoil;

    public KajuBarfi(String shape, int weightInGrams, boolean hasSilverFoil) {
        this.shape = shape;
        this.weightInGrams = weightInGrams;
        this.hasSilverFoil = hasSilverFoil;
    }

    @Override
    public String toString() {
        return "KajuBarfi [shape=" + shape + ", weight=" + weightInGrams + "g, hasSilverFoil=" + hasSilverFoil + "]";
    }
}
