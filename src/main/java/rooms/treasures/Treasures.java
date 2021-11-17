package rooms.treasures;

public enum Treasures {

    GOLD(10),
    GEMS(20);

    private final int value;

    Treasures(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
