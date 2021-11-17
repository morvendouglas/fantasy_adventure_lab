package characters;

public abstract class Character {

    private String name;
    private int wallet;
    private int healthLevel;

    public Character(String name, int wallet, int healthLevel) {
        this.name = name;
        this.wallet = wallet;
        this.healthLevel = healthLevel;
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public int getHealthLevel() {
        return healthLevel;
    }
}
