package com.xworkz.string.internal;

public class HotChocolate {
    private String cupSize;      // Small, Medium, Large
    private boolean hasMarshmallows;
    private String milkType;     // Dairy, Almond, Oat etc.

    public HotChocolate(String cupSize, boolean hasMarshmallows, String milkType) {
        this.cupSize = cupSize;
        this.hasMarshmallows = hasMarshmallows;
        this.milkType = milkType;
    }

    @Override
    public String toString() {
        return "HotChocolate [cupSize=" + cupSize + ", hasMarshmallows=" + hasMarshmallows + ", milkType=" + milkType + "]";
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
            return 13452;
        }

    }

}
