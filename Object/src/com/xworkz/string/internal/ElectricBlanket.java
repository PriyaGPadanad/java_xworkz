package com.xworkz.string.internal;

public class ElectricBlanket {
    private String material;
    private int heatLevels;
    private boolean washable;

    public ElectricBlanket(String material, int heatLevels, boolean washable) {
        this.material = material;
        this.heatLevels = heatLevels;
        this.washable = washable;
    }

    @Override
    public String toString() {
        return "ElectricBlanket [material=" + material + ", heatLevels=" + heatLevels + ", washable=" + washable + "]";
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
            return 54;
        }

    }

}
