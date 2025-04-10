package com.xworkz.string.internal;

public class Chocolate {
    private String type; // Dark, Milk, White
    private String brand;
    private boolean hasNuts;

    public Chocolate(String type, String brand, boolean hasNuts) {
        this.type = type;
        this.brand = brand;
        this.hasNuts = hasNuts;
    }

    @Override
    public String toString() {
        return "Chocolate [type=" + type + ", brand=" + brand + ", hasNuts=" + hasNuts + "]";
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
            return 1122;
        }

    }

}
