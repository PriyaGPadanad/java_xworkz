package com.xworkz.string.internal;

public class Headphones {
    private String type;
    private boolean isWireless;
    private String color;

    public Headphones(String type, boolean isWireless, String color) {
        this.type = type;
        this.isWireless = isWireless;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Headphones [type=" + type + ", wireless=" + isWireless + ", color=" + color + "]";
    }
}
