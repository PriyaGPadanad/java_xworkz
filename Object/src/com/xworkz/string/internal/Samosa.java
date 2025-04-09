package com.xworkz.string.internal;

public class Samosa {
    private String fillingType;
    private int calories;
    private boolean isSpicy;

    public Samosa(String fillingType, int calories, boolean isSpicy) {
        this.fillingType = fillingType;
        this.calories = calories;
        this.isSpicy = isSpicy;
    }

    @Override
    public String toString() {
        return "Samosa [fillingType=" + fillingType + ", calories=" + calories + ", isSpicy=" + isSpicy + "]";
    }
}
