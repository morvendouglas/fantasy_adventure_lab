package actions.attacks;

public enum Weapons {

    SWORD(15),
    AXE(10),
    CLUB(5);

    private final int attackPoint;

    Weapons(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }
}
