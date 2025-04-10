package com.xworkz.string.internal;

public class Dishwasher {
    private String brand;
    private int racks;
    private boolean hasDryer;

    public Dishwasher(String brand, int racks, boolean hasDryer) {
        this.brand = brand;
        this.racks = racks;
        this.hasDryer = hasDryer;
    }

    @Override
    public String toString() {
        return "Dishwasher [brand=" + brand + ", racks=" + racks + ", dryer=" + hasDryer + "]";
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
            return 8790;
        }

    }

}
