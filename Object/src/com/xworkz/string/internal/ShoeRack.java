package com.xworkz.string.internal;

public class ShoeRack {
    private int shelves;
    private String material;
    private boolean hasCover;

    public ShoeRack(int shelves, String material, boolean hasCover) {
        this.shelves = shelves;
        this.material = material;
        this.hasCover = hasCover;
    }

    @Override
    public String toString() {
        return "ShoeRack [shelves=" + shelves + ", material=" + material + ", cover=" + hasCover + "]";
    }
}
