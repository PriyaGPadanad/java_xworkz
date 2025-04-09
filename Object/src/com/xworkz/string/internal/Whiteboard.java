package com.xworkz.string.internal;

public class Whiteboard {
    private String frameMaterial;
    private int width;
    private int height;

    public Whiteboard(String frameMaterial, int width, int height) {
        this.frameMaterial = frameMaterial;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Whiteboard [frame=" + frameMaterial + ", size=" + width + "x" + height + "]";
    }
}
