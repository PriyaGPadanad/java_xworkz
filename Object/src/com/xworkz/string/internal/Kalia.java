package com.xworkz.string.internal;

public class Kalia {
    private String rival;
    private int egoLevel;
    private boolean isScaredOfBheem;

    public Kalia(String rival, int egoLevel, boolean isScaredOfBheem) {
        this.rival = rival;
        this.egoLevel = egoLevel;
        this.isScaredOfBheem = isScaredOfBheem;
    }

    @Override
    public String toString() {
        return "Kalia [rival=" + rival + ", egoLevel=" + egoLevel + ", isScaredOfBheem=" + isScaredOfBheem + "]";
    }
}
