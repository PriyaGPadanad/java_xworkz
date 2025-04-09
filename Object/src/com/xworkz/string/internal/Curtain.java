package com.xworkz.string.internal;

public class Curtain {
    private String fabric;
    private int length;
    private String color;

    public Curtain(String fabric, int length, String color) {
        this.fabric = fabric;
        this.length = length;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Curtain [fabric=" + fabric + ", length=" + length + "cm, color=" + color + "]";
    }
}
