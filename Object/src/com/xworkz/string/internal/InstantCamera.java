package com.xworkz.string.internal;

public class InstantCamera {
    private String brand;
    private String photoSize;
    private boolean hasSelfieMode;

    public InstantCamera(String brand, String photoSize, boolean hasSelfieMode) {
        this.brand = brand;
        this.photoSize = photoSize;
        this.hasSelfieMode = hasSelfieMode;
    }

    @Override
    public String toString() {
        return "InstantCamera [brand=" + brand + ", photoSize=" + photoSize + ", hasSelfieMode=" + hasSelfieMode + "]";
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
            return 767245;
        }

    }

}
