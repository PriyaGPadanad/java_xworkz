package com.xworkz.string.internal;

public class BreadMaker {
    private String brand;
    private int loafSize;
    private boolean autoKnead;

    public BreadMaker(String brand, int loafSize, boolean autoKnead) {
        this.brand = brand;
        this.loafSize = loafSize;
        this.autoKnead = autoKnead;
    }

    @Override
    public String toString() {
        return "BreadMaker [brand=" + brand + ", loafSize=" + loafSize + "g, autoKnead=" + autoKnead + "]";
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
            return 13579;
        }

    }

}
