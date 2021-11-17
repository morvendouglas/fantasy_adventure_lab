package actions.defences;

public enum HealingTools {

    POTION(10),
    HERBS(5);

    private final int resuscitationPoints;

    HealingTools(int resuscitationPoints) {
        this.resuscitationPoints = resuscitationPoints;
    }

    public int getResuscitationPoints() {
        return resuscitationPoints;
    }
}
