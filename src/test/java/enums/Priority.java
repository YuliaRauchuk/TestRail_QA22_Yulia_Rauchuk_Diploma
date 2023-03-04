package enums;

public enum Priority {

    CRITICAL("Critical"), HIGH("High"), MEDIUM("Medium"), LOW("Low");

    private final String name;

        Priority (String name) {
        this.name = name;
        }

    public String getName() {
        return this.name;
        }

    public static String fromString(String value) {
        for (Priority priority: Priority.values()) {
        if (priority.getName().equals(value)) {
        return String.valueOf(priority);
        }
        }
        return null;
        }
}