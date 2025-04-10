package com.xworkz.string.internal;

public class Coaster {
    private String design;
    private String material;
    private boolean isReusable;

    public Coaster(String design, String material, boolean isReusable) {
        this.design = design;
        this.material = material;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "Coaster [design=" + design + ", material=" + material + ", reusable=" + isReusable + "]";
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
            return 7788;
        }

    }

}
