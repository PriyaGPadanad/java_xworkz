package com.xworkz.string.internal;

public class ComicBook {
    private String title;
    private String heroName;
    private int totalPages;

    public ComicBook(String title, String heroName, int totalPages) {
        this.title = title;
        this.heroName = heroName;
        this.totalPages = totalPages;
    }

    @Override
    public String toString() {
        return "ComicBook [title=" + title + ", hero=" + heroName + ", totalPages=" + totalPages + "]";
    }
}
