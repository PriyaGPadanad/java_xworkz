package com.xworkz.string.internal;

public class StickyNotes {
    private String color;
    private int numberOfSheets;
    private boolean isLined;

    public StickyNotes(String color, int numberOfSheets, boolean isLined) {
        this.color = color;
        this.numberOfSheets = numberOfSheets;
        this.isLined = isLined;
    }

    @Override
    public String toString() {
        return "StickyNotes [color=" + color + ", numberOfSheets=" + numberOfSheets + ", isLined=" + isLined + "]";
    }
}
