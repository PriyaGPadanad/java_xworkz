package com.xworkz.string.internal;

public class ChoppingBoard {
    private String material;
    private boolean isDishwasherSafe;
    private String shape;

    public ChoppingBoard(String material, boolean isDishwasherSafe, String shape) {
        this.material = material;
        this.isDishwasherSafe = isDishwasherSafe;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "ChoppingBoard [material=" + material + ", dishwasherSafe=" + isDishwasherSafe + ", shape=" + shape + "]";
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
            return 3344;
        }

    }

}
