package com.xworkz.string.internal;

public class DishDryer {
    private String brand;
    private int capacityPlates;
    private boolean hasHeater;

    public DishDryer(String brand, int capacityPlates, boolean hasHeater) {
        this.brand = brand;
        this.capacityPlates = capacityPlates;
        this.hasHeater = hasHeater;
    }

    @Override
    public String toString() {
        return "DishDryer [brand=" + brand + ", capacity=" + capacityPlates + " plates, heater=" + hasHeater + "]";
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
            return 8690;
        }

    }

}
