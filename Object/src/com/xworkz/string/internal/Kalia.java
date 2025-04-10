package com.xworkz.string.internal;

public class Kalia {
    private String rival;
    private int egoLevel;
    private boolean isScaredOfBheem;

    public Kalia(String rival, int egoLevel, boolean isScaredOfBheem) {
        this.rival = rival;
        this.egoLevel = egoLevel;
        this.isScaredOfBheem = isScaredOfBheem;
    }

    @Override
    public String toString() {
        return "Kalia [rival=" + rival + ", egoLevel=" + egoLevel + ", isScaredOfBheem=" + isScaredOfBheem + "]";
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
            return 96432;
        }

    }

}
