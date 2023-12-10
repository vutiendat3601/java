package fundamental;

public enum Enum {
    SMALL("S"), MEDIUM("M"), LARGE("L");

    private Enum(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
