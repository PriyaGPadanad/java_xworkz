package com.xworkz.string.internal;

public class Barbie {
    private String profession;
    private String outfitColor;
    private boolean hasDreamHouse;

    public Barbie(String profession, String outfitColor, boolean hasDreamHouse) {
        this.profession = profession;
        this.outfitColor = outfitColor;
        this.hasDreamHouse = hasDreamHouse;
    }

    @Override
    public String toString() {
        return "Barbie [profession=" + profession + ", outfitColor=" + outfitColor + ", hasDreamHouse=" + hasDreamHouse + "]";
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
            return 456;
        }

    }

}

