package com.xworkz.string.internal;

public class IronBox {
    private String type;
    private int wattage;
    private boolean isSteamEnabled;

    public IronBox(String type, int wattage, boolean isSteamEnabled) {
        this.type = type;
        this.wattage = wattage;
        this.isSteamEnabled = isSteamEnabled;
    }

    @Override
    public String toString() {
        return "IronBox [type=" + type + ", wattage=" + wattage + "W, steamEnabled=" + isSteamEnabled + "]";
    }
}
