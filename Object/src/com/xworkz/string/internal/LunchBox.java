package com.xworkz.string.internal;

public class LunchBox {
    private String brand;
    private int compartments;
    private boolean isMicrowaveSafe;

    public LunchBox(String brand, int compartments, boolean isMicrowaveSafe) {
        this.brand = brand;
        this.compartments = compartments;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return "LunchBox [brand=" + brand + ", compartments=" + compartments + ", microwaveSafe=" + isMicrowaveSafe + "]";
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
            return 5452;
        }

    }

}
