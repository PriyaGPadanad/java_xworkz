package com.xworkz.string.internal;

public class Geyser {
    private String brand;
    private int capacity;
    private boolean instantHeat;

    public Geyser(String brand, int capacity, boolean instantHeat) {
        this.brand = brand;
        this.capacity = capacity;
        this.instantHeat = instantHeat;
    }

    @Override
    public String toString() {
        return "Geyser [brand=" + brand + ", capacity=" + capacity + "L, instant=" + instantHeat + "]";
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
            return 99789;
        }

    }

}
