package com.xworkz.string.internal;

public class Phoenix {
    private String name;
    private int rebirthCycle;
    private boolean glowsInDark;

    public Phoenix(String name, int rebirthCycle, boolean glowsInDark) {
        this.name = name;
        this.rebirthCycle = rebirthCycle;
        this.glowsInDark = glowsInDark;
    }

    @Override
    public String toString() {
        return "Phoenix [name=" + name + ", rebirthCycle=" + rebirthCycle + ", glowsInDark=" + glowsInDark + "]";
    }
}
