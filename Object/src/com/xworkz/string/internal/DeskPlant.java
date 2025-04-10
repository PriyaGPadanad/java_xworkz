package com.xworkz.string.internal;

public class DeskPlant {
    private String plantName;
    private boolean isArtificial;
    private String potColor;

    public DeskPlant(String plantName, boolean isArtificial, String potColor) {
        this.plantName = plantName;
        this.isArtificial = isArtificial;
        this.potColor = potColor;
    }

    @Override
    public String toString() {
        return "DeskPlant [plantName=" + plantName + ", artificial=" + isArtificial + ", potColor=" + potColor + "]";
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
            return 2446;
        }

    }

}
