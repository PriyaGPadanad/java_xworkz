package com.xworkz.string.internal;

public class KajuBarfi {
    private String shape;
    private int weightInGrams;
    private boolean hasSilverFoil;

    public KajuBarfi(String shape, int weightInGrams, boolean hasSilverFoil) {
        this.shape = shape;
        this.weightInGrams = weightInGrams;
        this.hasSilverFoil = hasSilverFoil;
    }

    @Override
    public String toString() {
        return "KajuBarfi [shape=" + shape + ", weight=" + weightInGrams + "g, hasSilverFoil=" + hasSilverFoil + "]";
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
            return 97865;
        }

    }

}
