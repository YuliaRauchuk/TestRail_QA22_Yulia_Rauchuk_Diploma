package enums;

public enum Type {


    ACCEPTANCE("Acceptance"), ACCESSIBILITY("Accessibility"), AUTOMATED("Automated"), COMPATIBILITY("Compatibility"),
    DESTRUCTIVE("Destructive"), FUNCTIONAL("Functional"), OTHER("Other"),PERFORMANCE("Performance"), REGRESSION("Regression"),
    SECURITY("Security"), USABILITY("Usability");

    private final String name;

    Type (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static String fromString(String value) {
        for (Type type: Type.values()) {
            if (type.getName().equals(value)) {
                return String.valueOf(type);
            }
        }
        return null;
    }



}