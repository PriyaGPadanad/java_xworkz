package com.xworkz.string.internal;

public class Dustbin {
    private int capacity;
    private boolean hasLid;
    private String color;

    public Dustbin(int capacity, boolean hasLid, String color) {
        this.capacity = capacity;
        this.hasLid = hasLid;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dustbin [capacity=" + capacity + "L, lid=" + hasLid + ", color=" + color + "]";
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
            return 8906;
        }

    }

}
