package com.xworkz.string.internal;

public class Chutki {
    private String bestFriend;
    private String favoriteColor;
    private boolean helpsBheem;

    public Chutki(String bestFriend, String favoriteColor, boolean helpsBheem) {
        this.bestFriend = bestFriend;
        this.favoriteColor = favoriteColor;
        this.helpsBheem = helpsBheem;
    }

    @Override
    public String toString() {
        return "Chutki [bestFriend=" + bestFriend + ", favoriteColor=" + favoriteColor + ", helpsBheem=" + helpsBheem + "]";
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
            return 5566;
        }

    }

}
