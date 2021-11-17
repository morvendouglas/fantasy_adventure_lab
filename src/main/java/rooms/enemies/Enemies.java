package rooms.enemies;

public enum Enemies {

    TROLL(10),
    ORC(5);

    private final int healthLevel;

    Enemies(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }
}
