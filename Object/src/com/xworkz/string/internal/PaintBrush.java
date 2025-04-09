package com.xworkz.string.internal;

public class PaintBrush {
    private String size;
    private String material;
    private boolean isSynthetic;

    public PaintBrush(String size, String material, boolean isSynthetic) {
        this.size = size;
        this.material = material;
        this.isSynthetic = isSynthetic;
    }

    @Override
    public String toString() {
        return "PaintBrush [size=" + size + ", material=" + material + ", synthetic=" + isSynthetic + "]";
    }
}
