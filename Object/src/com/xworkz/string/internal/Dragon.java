package com.xworkz.string.internal;

public class Dragon {
    private String species;
    private int firePower;
    private boolean canFly;

    public Dragon(String species, int firePower, boolean canFly) {
        this.species = species;
        this.firePower = firePower;
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Dragon [species=" + species + ", firePower=" + firePower + ", canFly=" + canFly + "]";
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
            return  43;
        }

    }

}
