package com.xworkz.string.internal;

public class Curtain {
    private String fabric;
    private int length;
    private String color;

    public Curtain(String fabric, int length, String color) {
        this.fabric = fabric;
        this.length = length;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Curtain [fabric=" + fabric + ", length=" + length + "cm, color=" + color + "]";
    }
    package com.xworkz.string.internal;

    public class AlarmClock {
        private String type;
        private boolean snooze;
        private boolean batteryBackup;

        public AlarmClock(String type, boolean snooze, boolean batteryBackup) {
            this.type = type;
            this.snooze = snooze;
            this.batteryBackup = batteryBackup;
        }

        @Override
        public String toString() {
            return "AlarmClock [type=" + type + ", snooze=" + snooze + ", batteryBackup=" + batteryBackup + "]";


        }
        @Override
        public int hashCode(){
            return 2458;
        }

    }

}
