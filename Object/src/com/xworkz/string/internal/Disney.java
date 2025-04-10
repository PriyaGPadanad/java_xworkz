package com.xworkz.string.internal;

public class Disney {
    private String character;
    private String movie;
    private boolean hasThemeParkRide;

    public Disney(String character, String movie, boolean hasThemeParkRide) {
        this.character = character;
        this.movie = movie;
        this.hasThemeParkRide = hasThemeParkRide;
    }

    @Override
    public String toString() {
        return "Disney [character=" + character + ", movie=" + movie + ", themeParkRide=" + hasThemeParkRide + "]";
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
            return 1325;
        }

    }

}
