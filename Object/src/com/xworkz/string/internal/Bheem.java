package com.xworkz.string.internal;

public class Bheem {
    private String hometown;
    private int strengthLevel;
    private boolean lovesLadoo;

    public Bheem(String hometown, int strengthLevel, boolean lovesLadoo) {
        this.hometown = hometown;
        this.strengthLevel = strengthLevel;
        this.lovesLadoo = lovesLadoo;
    }

    @Override
    public String toString() {
        return "Bheem [hometown=" + hometown + ", strengthLevel=" + strengthLevel + ", lovesLadoo=" + lovesLadoo + "]";
    }
}
