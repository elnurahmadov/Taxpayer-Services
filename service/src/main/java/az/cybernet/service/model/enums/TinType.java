package az.cybernet.service.model.enums;

public enum TinType {
    LEGAL("legal"),
    INDIVIDUAL("individual");

    private final String value;

    TinType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TinType fromValue(String value) {
        for (TinType type : values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown enum value: " + value);
    }
}
