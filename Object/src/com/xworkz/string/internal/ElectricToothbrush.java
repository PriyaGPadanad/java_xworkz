package com.xworkz.string.internal;

public class ElectricToothbrush {
    private String brand;
    private int speedLevels;
    private boolean timer;

    public ElectricToothbrush(String brand, int speedLevels, boolean timer) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.timer = timer;
    }

    @Override
    public String toString() {
        return "ElectricToothbrush [brand=" + brand + ", speeds=" + speedLevels + ", timer=" + timer + "]";
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
            return 2456;
        }

    }

}
