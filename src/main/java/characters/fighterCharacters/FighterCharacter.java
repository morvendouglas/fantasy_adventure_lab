package characters.fighterCharacters;

import actions.attacks.Weapons;
import behaviours.IChange;
import characters.Character;

public abstract class FighterCharacter extends Character  {

    private Weapons weapons;

    public FighterCharacter(String name, int wallet, int healthLevel, Weapons weapons) {
        super(name, wallet, healthLevel);
        this.weapons = weapons;
    }

    public Weapons getWeapons() {
        return weapons;
    }

}
