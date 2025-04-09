package com.xworkz.string.internal;

public class Disney {
    private String character;
    private String movie;
    private boolean hasThemeParkRide;

    public Disney(String character, String movie, boolean hasThemeParkRide) {
        this.character = character;
        this.movie = movie;
        this.hasThemeParkRide = hasThemeParkRide;
    }

    @Override
    public String toString() {
        return "Disney [character=" + character + ", movie=" + movie + ", themeParkRide=" + hasThemeParkRide + "]";
    }
}
