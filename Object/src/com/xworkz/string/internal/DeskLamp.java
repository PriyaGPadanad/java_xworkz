package com.xworkz.string.internal;

public class DeskLamp {
    private String color;
    private boolean isRechargeable;
    private int brightnessLevel;

    public DeskLamp(String color, boolean isRechargeable, int brightnessLevel) {
        this.color = color;
        this.isRechargeable = isRechargeable;
        this.brightnessLevel = brightnessLevel;
    }

    @Override
    public String toString() {
        return "DeskLamp [color=" + color + ", rechargeable=" + isRechargeable + ", brightness=" + brightnessLevel + "]";
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
            return 648;
        }

    }

}