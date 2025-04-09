package com.xworkz.string.internal;

public class WallMirror {
    private String shape;
    private String frameMaterial;
    private int heightCm;

    public WallMirror(String shape, String frameMaterial, int heightCm) {
        this.shape = shape;
        this.frameMaterial = frameMaterial;
        this.heightCm = heightCm;
    }

    @Override
    public String toString() {
        return "WallMirror [shape=" + shape + ", frame=" + frameMaterial + ", height=" + heightCm + "cm]";
    }
}
