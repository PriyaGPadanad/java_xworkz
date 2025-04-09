package com.xworkz.string.internal;

public class Griffin {
    private String name;
    private double wingspan;
    private boolean guardsTreasure;

    public Griffin(String name, double wingspan, boolean guardsTreasure) {
        this.name = name;
        this.wingspan = wingspan;
        this.guardsTreasure = guardsTreasure;
    }

    @Override
    public String toString() {
        return "Griffin [name=" + name + ", wingspan=" + wingspan + "m, guardsTreasure=" + guardsTreasure + "]";
    }
}
