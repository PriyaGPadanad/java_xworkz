package com.xworkz.string.internal;

public class RoomHeater {
    private String type;
    private int power;
    private boolean remote;

    public RoomHeater(String type, int power, boolean remote) {
        this.type = type;
        this.power = power;
        this.remote = remote;
    }

    @Override
    public String toString() {
        return "RoomHeater [type=" + type + ", power=" + power + "W, remote=" + remote + "]";
    }
}
