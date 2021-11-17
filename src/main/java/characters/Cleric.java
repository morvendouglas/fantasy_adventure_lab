package characters;

import actions.defences.HealingTools;

public class Cleric extends Character {

    private HealingTools healingTools;

    public Cleric(String name, int wallet, int healthLevel, HealingTools healingTools) {
        super(name, wallet, healthLevel);
        this.healingTools = healingTools;
    }

    public HealingTools getHealingTools() {
        return healingTools;
    }
}
