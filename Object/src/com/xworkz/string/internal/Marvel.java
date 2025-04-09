package com.xworkz.string.internal;

public class Marvel {
    private String heroName;
    private String superPower;
    private boolean isAvenger;

    public Marvel(String heroName, String superPower, boolean isAvenger) {
        this.heroName = heroName;
        this.superPower = superPower;
        this.isAvenger = isAvenger;
    }

    @Override
    public String toString() {
        return "Marvel [heroName=" + heroName + ", superPower=" + superPower + ", isAvenger=" + isAvenger + "]";
    }
}
