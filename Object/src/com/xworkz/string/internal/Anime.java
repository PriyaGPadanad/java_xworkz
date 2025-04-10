package com.xworkz.string.internal;

public class Anime {
    private String title;
    private String mainCharacter;
    private boolean hasMultipleSeasons;

    public Anime(String title, String mainCharacter, boolean hasMultipleSeasons) {
        this.title = title;
        this.mainCharacter = mainCharacter;
        this.hasMultipleSeasons = hasMultipleSeasons;
    }

    @Override
    public String toString() {
        return "Anime [title=" + title + ", mainCharacter=" + mainCharacter + ", hasMultipleSeasons=" + hasMultipleSeasons + "]";
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
            return 698;
        }

    }

}
