package com.xworkz.string.internal;

public class Unicorn {
    private String name;
    private String color;
    private boolean hasMagicHorn;

    public Unicorn(String name, String color, boolean hasMagicHorn) {
        this.name = name;
        this.color = color;
        this.hasMagicHorn = hasMagicHorn;
    }

    @Override
    public String toString() {
        return "Unicorn [name=" + name + ", color=" + color + ", magicHorn=" + hasMagicHorn + "]";
    }
}
