package com.xworkz.string.internal;

public class Sunglasses {
    private String frameColor;
    private boolean isPolarized;
    private String lensType;

    public Sunglasses(String frameColor, boolean isPolarized, String lensType) {
        this.frameColor = frameColor;
        this.isPolarized = isPolarized;
        this.lensType = lensType;
    }

    @Override
    public String toString() {
        return "Sunglasses [frameColor=" + frameColor + ", polarized=" + isPolarized + ", lensType=" + lensType + "]";
    }
}
