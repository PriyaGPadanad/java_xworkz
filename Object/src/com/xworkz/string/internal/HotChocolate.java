package com.xworkz.string.internal;

public class HotChocolate {
    private String cupSize;      // Small, Medium, Large
    private boolean hasMarshmallows;
    private String milkType;     // Dairy, Almond, Oat etc.

    public HotChocolate(String cupSize, boolean hasMarshmallows, String milkType) {
        this.cupSize = cupSize;
        this.hasMarshmallows = hasMarshmallows;
        this.milkType = milkType;
    }

    @Override
    public String toString() {
        return "HotChocolate [cupSize=" + cupSize + ", hasMarshmallows=" + hasMarshmallows + ", milkType=" + milkType + "]";
    }
}
