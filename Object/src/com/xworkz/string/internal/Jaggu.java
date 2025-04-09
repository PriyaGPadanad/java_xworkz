package com.xworkz.string.internal;

public class Jaggu {
    private String species;
    private String favoriteFruit;
    private boolean canTalk;

    public Jaggu(String species, String favoriteFruit, boolean canTalk) {
        this.species = species;
        this.favoriteFruit = favoriteFruit;
        this.canTalk = canTalk;
    }

    @Override
    public String toString() {
        return "Jaggu [species=" + species + ", favoriteFruit=" + favoriteFruit + ", canTalk=" + canTalk + "]";
    }
}
