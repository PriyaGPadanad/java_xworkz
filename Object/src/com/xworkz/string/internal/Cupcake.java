package com.xworkz.string.internal;

public class Cupcake {
    private String flavor;
    private String frostingColor;
    private boolean hasSprinkles;

    public Cupcake(String flavor, String frostingColor, boolean hasSprinkles) {
        this.flavor = flavor;
        this.frostingColor = frostingColor;
        this.hasSprinkles = hasSprinkles;
    }

    @Override
    public String toString() {
        return "Cupcake [flavor=" + flavor + ", frostingColor=" + frostingColor + ", hasSprinkles=" + hasSprinkles + "]";
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
            return 1357;
        }

    }

}
