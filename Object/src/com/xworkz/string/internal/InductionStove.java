package com.xworkz.string.internal;

public class InductionStove {
    private String brand;
    private int powerWatts;
    private boolean autoSwitchOff;

    public InductionStove(String brand, int powerWatts, boolean autoSwitchOff) {
        this.brand = brand;
        this.powerWatts = powerWatts;
        this.autoSwitchOff = autoSwitchOff;
    }

    @Override
    public String toString() {
        return "InductionStove [brand=" + brand + ", power=" + powerWatts + "W, autoSwitchOff=" + autoSwitchOff + "]";
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
            return 1536;
        }

    }

}
