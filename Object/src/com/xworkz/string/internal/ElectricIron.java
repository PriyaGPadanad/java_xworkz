package com.xworkz.string.internal;

public class ElectricIron {
    private String brand;
    private int powerWatts;
    private boolean steamEnabled;

    public ElectricIron(String brand, int powerWatts, boolean steamEnabled) {
        this.brand = brand;
        this.powerWatts = powerWatts;
        this.steamEnabled = steamEnabled;
    }

    @Override
    public String toString() {
        return "ElectricIron [brand=" + brand + ", power=" + powerWatts + "W, steamEnabled=" + steamEnabled + "]";
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
            return 7887;
        }

    }

}
