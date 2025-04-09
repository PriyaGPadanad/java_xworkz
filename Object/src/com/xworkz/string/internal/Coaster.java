package com.xworkz.string.internal;

public class Coaster {
    private String design;
    private String material;
    private boolean isReusable;

    public Coaster(String design, String material, boolean isReusable) {
        this.design = design;
        this.material = material;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "Coaster [design=" + design + ", material=" + material + ", reusable=" + isReusable + "]";
    }
}
