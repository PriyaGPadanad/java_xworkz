package com.xworkz.string.internal;

public class ComicBook {
    private String title;
    private String heroName;
    private int totalPages;

    public ComicBook(String title, String heroName, int totalPages) {
        this.title = title;
        this.heroName = heroName;
        this.totalPages = totalPages;
    }

    @Override
    public String toString() {
        return "ComicBook [title=" + title + ", hero=" + heroName + ", totalPages=" + totalPages + "]";
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
            return 86542;
        }

    }

}
