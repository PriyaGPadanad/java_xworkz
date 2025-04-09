package com.xworkz.string.internal;

public class PortableHeater {
    private String type;
    private int power;
    private boolean safetySwitch;

    public PortableHeater(String type, int power, boolean safetySwitch) {
        this.type = type;
        this.power = power;
        this.safetySwitch = safetySwitch;
    }

    @Override
    public String toString() {
        return "PortableHeater [type=" + type + ", power=" + power + "W, safetySwitch=" + safetySwitch + "]";
    }
}
