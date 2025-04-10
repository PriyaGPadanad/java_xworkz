package com.xworkz.string.internal;

public class IceTray {
    private int cubeCount;
    private String material;
    private boolean isFlexible;

    public IceTray(int cubeCount, String material, boolean isFlexible) {
        this.cubeCount = cubeCount;
        this.material = material;
        this.isFlexible = isFlexible;
    }

    @Override
    public String toString() {
        return "IceTray [cubes=" + cubeCount + ", material=" + material + ", flexible=" + isFlexible + "]";
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
            return 8563;
        }

    }

}
