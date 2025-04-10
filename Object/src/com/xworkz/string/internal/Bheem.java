package com.xworkz.string.internal;

public class Bheem {
    private String hometown;
    private int strengthLevel;
    private boolean lovesLadoo;

    public Bheem(String hometown, int strengthLevel, boolean lovesLadoo) {
        this.hometown = hometown;
        this.strengthLevel = strengthLevel;
        this.lovesLadoo = lovesLadoo;
    }

    @Override
    public String toString() {
        return "Bheem [hometown=" + hometown + ", strengthLevel=" + strengthLevel + ", lovesLadoo=" + lovesLadoo + "]";
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
            return 987;
        }

    }

}
