package enums;

public enum AutomationType {
    NONE("None"), RANOREX("Ranorex");

    private final String name;

    AutomationType (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static String fromString(String value) {
        for (AutomationType automationType: AutomationType.values()) {
            if (automationType.getName().equals(value)) {
                return String.valueOf(automationType);
            }
        }
        return null;
    }
}

