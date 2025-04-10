package com.xworkz.string.internal;

public class Jalebi{
    private String color;
    private int diameterInCm;
    private boolean isHot;

    public Jalebi(String color, int diameterInCm, boolean isHot) {
        this.color = color;
        this.diameterInCm = diameterInCm;
        this.isHot = isHot;
    }

    @Override
    public String toString() {
        return "Jalebi [color=" + color + ", diameter=" + diameterInCm + "cm, isHot=" + isHot + "]";
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
            return 7644;
        }

    }

}
