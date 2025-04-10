package com.xworkz.string.internal;

public class Bean {
    private String fullName;
    private String favoriteItem;
    private boolean drivesMiniCar;

    public Bean(String fullName, String favoriteItem, boolean drivesMiniCar) {
        this.fullName = fullName;
        this.favoriteItem = favoriteItem;
        this.drivesMiniCar = drivesMiniCar;
    }

    @Override
    public String toString() {
        return "Bean [fullName=" + fullName + ", favoriteItem=" + favoriteItem + ", drivesMiniCar=" + drivesMiniCar + "]";
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
            return 789;
        }

    }

}
