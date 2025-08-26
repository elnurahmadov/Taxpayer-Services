package az.cybernet.service.model.enums;

public enum StatusOfTaxpayer {
    ACTIVE("active"),
    TEMPORARILY_SUSPENDED("temporarily_suspended"),
    REVOKED("revoked");

    private final String value;

    StatusOfTaxpayer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static StatusOfTaxpayer fromValue(String value) {
        for (StatusOfTaxpayer status : values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown enum value: " + value);
    }
}
