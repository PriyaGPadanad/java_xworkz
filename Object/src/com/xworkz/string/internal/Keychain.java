package com.xworkz.string.internal;

public class Keychain {
    private String shape;
    private String material;
    private boolean hasTorch;

    public Keychain(String shape, String material, boolean hasTorch) {
        this.shape = shape;
        this.material = material;
        this.hasTorch = hasTorch;
    }

    @Override
    public String toString() {
        return "Keychain [shape=" + shape + ", material=" + material + ", hasTorch=" + hasTorch + "]";
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
            return 97854;
        }

    }

}
