package com.xworkz.string.internal;

public class Mocktail {
    private String name;
    private String baseIngredient;
    private boolean isIced;

    public Mocktail(String name, String baseIngredient, boolean isIced) {
        this.name = name;
        this.baseIngredient = baseIngredient;
        this.isIced = isIced;
    }

    @Override
    public String toString() {
        return "Mocktail [name=" + name + ", baseIngredient=" + baseIngredient + ", isIced=" + isIced + "]";
    }
}
