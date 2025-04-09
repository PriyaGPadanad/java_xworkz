package com.xworkz.string.internal;

public class Dustbin {
    private int capacity;
    private boolean hasLid;
    private String color;

    public Dustbin(int capacity, boolean hasLid, String color) {
        this.capacity = capacity;
        this.hasLid = hasLid;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dustbin [capacity=" + capacity + "L, lid=" + hasLid + ", color=" + color + "]";
    }
}
