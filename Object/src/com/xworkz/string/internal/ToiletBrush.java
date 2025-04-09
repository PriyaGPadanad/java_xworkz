package com.xworkz.string.internal;

public class ToiletBrush {
    private String bristleType;
    private String holderColor;
    private boolean hasStand;

    public ToiletBrush(String bristleType, String holderColor, boolean hasStand) {
        this.bristleType = bristleType;
        this.holderColor = holderColor;
        this.hasStand = hasStand;
    }

    @Override
    public String toString() {
        return "ToiletBrush [bristle=" + bristleType + ", holderColor=" + holderColor + ", stand=" + hasStand + "]";
    }
}
