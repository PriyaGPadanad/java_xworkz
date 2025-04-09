package com.xworkz.string.internal;

public class Dragon {
    private String species;
    private int firePower;
    private boolean canFly;

    public Dragon(String species, int firePower, boolean canFly) {
        this.species = species;
        this.firePower = firePower;
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Dragon [species=" + species + ", firePower=" + firePower + ", canFly=" + canFly + "]";
    }
}
