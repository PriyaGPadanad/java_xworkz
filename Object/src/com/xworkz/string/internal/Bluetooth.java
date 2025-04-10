package com.xworkz.string.internal;

public class Bluetooth {
    private String version;
    private int rangeInMeters;
    private boolean supportsAudio;

    public Bluetooth(String version, int rangeInMeters, boolean supportsAudio) {
        this.version = version;
        this.rangeInMeters = rangeInMeters;
        this.supportsAudio = supportsAudio;
    }

    @Override
    public String toString() {
        return "Bluetooth [version=" + version + ", range=" + rangeInMeters + " meters, supportsAudio=" + supportsAudio + "]";
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
            return 321;
        }

    }

}
