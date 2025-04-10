package com.xworkz.string.internal;

public class HairStraightener {
    private String brand;
    private int tempRange;
    private boolean ceramicCoating;

    public HairStraightener(String brand, int tempRange, boolean ceramicCoating) {
        this.brand = brand;
        this.tempRange = tempRange;
        this.ceramicCoating = ceramicCoating;
    }

    @Override
    public String toString() {
        return "HairStraightener [brand=" + brand + ", temp=" + tempRange + "°C, ceramic=" + ceramicCoating + "]";
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
            return 4364;
        }

    }

}
