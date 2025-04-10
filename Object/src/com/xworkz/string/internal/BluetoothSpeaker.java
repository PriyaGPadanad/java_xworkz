package com.xworkz.string.internal;

public class BluetoothSpeaker {
    private String brand;
    private int batteryHours;
    private boolean waterproof;

    public BluetoothSpeaker(String brand, int batteryHours, boolean waterproof) {
        this.brand = brand;
        this.batteryHours = batteryHours;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "BluetoothSpeaker [brand=" + brand + ", battery=" + batteryHours + "h, waterproof=" + waterproof + "]";
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
            return 2468;
        }

    }

}
