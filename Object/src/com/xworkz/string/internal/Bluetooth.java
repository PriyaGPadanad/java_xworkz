package com.xworkz.string.internal;

public class Bluetooth {
    private String version;
    private int rangeInMeters;
    private boolean supportsAudio;

    public Bluetooth(String version, int rangeInMeters, boolean supportsAudio) {
        this.version = version;
        this.rangeInMeters = rangeInMeters;
        this.supportsAudio = supportsAudio;
    }

    @Override
    public String toString() {
        return "Bluetooth [version=" + version + ", range=" + rangeInMeters + " meters, supportsAudio=" + supportsAudio + "]";
    }
}
