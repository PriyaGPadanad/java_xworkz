package com.xworkz.string.internal;

public class Griffin {
    private String name;
    private double wingspan;
    private boolean guardsTreasure;

    public Griffin(String name, double wingspan, boolean guardsTreasure) {
        this.name = name;
        this.wingspan = wingspan;
        this.guardsTreasure = guardsTreasure;
    }

    @Override
    public String toString() {
        return "Griffin [name=" + name + ", wingspan=" + wingspan + "m, guardsTreasure=" + guardsTreasure + "]";
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
            return 9064;
        }

    }

}
