package com.xworkz.string.internal;

public class Raju {
    private int age;
    private String weapon;
    private boolean wearsDiaper;

    public Raju(int age, String weapon, boolean wearsDiaper) {
        this.age = age;
        this.weapon = weapon;
        this.wearsDiaper = wearsDiaper;
    }

    @Override
    public String toString() {
        return "Raju [age=" + age + ", weapon=" + weapon + ", wearsDiaper=" + wearsDiaper + "]";
    }
}
