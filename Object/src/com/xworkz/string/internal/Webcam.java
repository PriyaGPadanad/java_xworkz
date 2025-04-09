package com.xworkz.string.internal;

public class Webcam {
    private String resolution;
    private boolean hasMicrophone;
    private String brand;

    public Webcam(String resolution, boolean hasMicrophone, String brand) {
        this.resolution = resolution;
        this.hasMicrophone = hasMicrophone;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Webcam [resolution=" + resolution + ", mic=" + hasMicrophone + ", brand=" + brand + "]";
    }
}
