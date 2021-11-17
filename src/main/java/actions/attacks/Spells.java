package actions.attacks;

public enum Spells {

    FIREBALL(5),
    LIGHTENING_STRIKE(15);

    private final int attackPoint;

    Spells(int attackPoint) { this.attackPoint = attackPoint; }

    public int getAttackPoint() {
        return attackPoint;
    }
}
