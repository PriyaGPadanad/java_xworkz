package com.xworkz.string.internal;

public class CoffeeMug {
    private String color;
    private int capacityInMl;
    private boolean isMicrowaveSafe;

    public CoffeeMug(String color, int capacityInMl, boolean isMicrowaveSafe) {
        this.color = color;
        this.capacityInMl = capacityInMl;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return "CoffeeMug [color=" + color + ", capacity=" + capacityInMl + "ml, microwaveSafe=" + isMicrowaveSafe + "]";
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
            return 5678;
        }

    }

}
