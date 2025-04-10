package com.xworkz.string.internal;

public class LaptopStand {
    private String material;
    private boolean isAdjustable;
    private String color;

    public LaptopStand(String material, boolean isAdjustable, String color) {
        this.material = material;
        this.isAdjustable = isAdjustable;
        this.color = color;
    }

    @Override
    public String toString() {
        return "LaptopStand [material=" + material + ", adjustable=" + isAdjustable + ", color=" + color + "]";
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
            return 8553;
        }

    }

}
