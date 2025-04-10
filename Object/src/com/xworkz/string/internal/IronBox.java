package com.xworkz.string.internal;

public class IronBox {
    private String type;
    private int wattage;
    private boolean isSteamEnabled;

    public IronBox(String type, int wattage, boolean isSteamEnabled) {
        this.type = type;
        this.wattage = wattage;
        this.isSteamEnabled = isSteamEnabled;
    }

    @Override
    public String toString() {
        return "IronBox [type=" + type + ", wattage=" + wattage + "W, steamEnabled=" + isSteamEnabled + "]";
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
            return 5543432;
        }

    }

}
