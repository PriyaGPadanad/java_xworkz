package com.xworkz.string.internal;

public class ElectricKettle {
    private String brand;
    private double capacity;
    private boolean autoShutOff;

    public ElectricKettle(String brand, double capacity, boolean autoShutOff) {
        this.brand = brand;
        this.capacity = capacity;
        this.autoShutOff = autoShutOff;
    }

    @Override
    public String toString() {
        return "ElectricKettle [brand=" + brand + ", capacity=" + capacity + "L, autoShutOff=" + autoShutOff + "]";
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
            return 96675;
        }

    }

}
