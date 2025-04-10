package com.xworkz.string.internal;

public class Microwave {
    private String brand;
    private int powerWatts;
    private boolean hasGrillFunction;

     public Microwave(String brand,int powerWatts,boolean hasGrillFunction){
        this.brand=brand;
        this.powerWatts=powerWatts;
        this.hasGrillFunction=hasGrillFunction;
    }

    @Override
    public String toString() {
        return "Microwave [brand=" + brand + "," + " power=" + powerWatts + "W, grillFunction=" + hasGrillFunction + "]";
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
            return 9774;
        }

    }

}
