package com.xworkz.string.internal;

public class Cushion {
    private String shape;
    private String fabric;
    private boolean isWashable;

    public Cushion(String shape, String fabric, boolean isWashable) {
        this.shape = shape;
        this.fabric = fabric;
        this.isWashable = isWashable;
    }

    @Override
    public String toString() {
        return "Cushion [shape=" + shape + ", fabric=" + fabric + ", isWashable=" + isWashable + "]";
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
            return 876554;
        }

    }


}
