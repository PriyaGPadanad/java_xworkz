package com.xworkz.string.internal;

public class Marvel {
    private String heroName;
    private String superPower;
    private boolean isAvenger;

    public Marvel(String heroName, String superPower, boolean isAvenger) {
        this.heroName = heroName;
        this.superPower = superPower;
        this.isAvenger = isAvenger;
    }

    @Override
    public String toString() {
        return "Marvel [heroName=" + heroName + ", superPower=" + superPower + ", isAvenger=" + isAvenger + "]";
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
            return 9675;
        }

    }

}
