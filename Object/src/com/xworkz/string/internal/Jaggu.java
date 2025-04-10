package com.xworkz.string.internal;

public class Jaggu {
    private String species;
    private String favoriteFruit;
    private boolean canTalk;

    public Jaggu(String species, String favoriteFruit, boolean canTalk) {
        this.species = species;
        this.favoriteFruit = favoriteFruit;
        this.canTalk = canTalk;
    }

    @Override
    public String toString() {
        return "Jaggu [species=" + species + ", favoriteFruit=" + favoriteFruit + ", canTalk=" + canTalk + "]";
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
            return 87555;
        }

    }

}
