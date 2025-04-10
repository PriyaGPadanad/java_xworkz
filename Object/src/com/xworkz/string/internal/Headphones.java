package com.xworkz.string.internal;

public class Headphones {
    private String type;
    private boolean isWireless;
    private String color;

    public Headphones(String type, boolean isWireless, String color) {
        this.type = type;
        this.isWireless = isWireless;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Headphones [type=" + type + ", wireless=" + isWireless + ", color=" + color + "]";
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
            return 7676;
        }

    }

}
