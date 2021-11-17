package actions.defences;

public enum MythicalCreatures {

    DRAGON(20),
    OGRE(10);

    private final int defencePoints;

    MythicalCreatures(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public int getDefencePoints() {
        return defencePoints;
    }
}
