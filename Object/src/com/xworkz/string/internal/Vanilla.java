package com.xworkz.string.internal;

public class Vanilla {
    private String origin;
    private String form; // like extract, bean, powder
    private boolean isSweetened;

    public Vanilla(String origin, String form, boolean isSweetened) {
        this.origin = origin;
        this.form = form;
        this.isSweetened = isSweetened;
    }

    @Override
    public String toString() {
        return "Vanilla [origin=" + origin + ", form=" + form + ", isSweetened=" + isSweetened + "]";
    }
}
