package com.xworkz.string.internal;

public class DeskClock {
    private String type; // analog or digital
    private String brand;
    private boolean hasAlarm;

    public DeskClock(String type, String brand, boolean hasAlarm) {
        this.type = type;
        this.brand = brand;
        this.hasAlarm = hasAlarm;
    }

    @Override
    public String toString() {
        return "DeskClock [type=" + type + ", brand=" + brand + ", hasAlarm=" + hasAlarm + "]";
    }
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
        return 6348;
    }

}

