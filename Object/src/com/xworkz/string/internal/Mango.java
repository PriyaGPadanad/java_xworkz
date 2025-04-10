package com.xworkz.string.internal;

public class Mango {
    private String variety;
    private String origin;
    private boolean isRipe;

    public Mango(String variety, String origin, boolean isRipe) {
        this.variety = variety;
        this.origin = origin;
        this.isRipe = isRipe;
    }

    @Override
    public String toString() {
        return "Mango [variety=" + variety + ", origin=" + origin + ", isRipe=" + isRipe + "]";
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
            return 4236;
        }

    }

}
