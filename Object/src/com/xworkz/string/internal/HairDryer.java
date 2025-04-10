package com.xworkz.string.internal;

public class HairDryer {
    private String brand;
    private int heatSettings;
    private boolean coolShotAvailable;

    public HairDryer(String brand, int heatSettings, boolean coolShotAvailable) {
        this.brand = brand;
        this.heatSettings = heatSettings;
        this.coolShotAvailable = coolShotAvailable;
    }

    @Override
    public String toString() {
        return "HairDryer [brand=" + brand + ", heatSettings=" + heatSettings + ", coolShot=" + coolShotAvailable + "]";
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
            return 8664;
        }

    }

}
