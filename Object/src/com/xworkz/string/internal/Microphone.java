package com.xworkz.string.internal;

public class Microphone {
    private String type;
    private boolean isUSB;
    private String brand;

    public Microphone(String type, boolean isUSB, String brand) {
        this.type = type;
        this.isUSB = isUSB;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Microphone [type=" + type + ", USB=" + isUSB + ", brand=" + brand + "]";
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
            return 24573;
        }

    }

}
