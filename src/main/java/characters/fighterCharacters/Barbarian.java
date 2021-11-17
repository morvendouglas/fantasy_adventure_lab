package characters.fighterCharacters;

import actions.attacks.Weapons;

public class Barbarian extends FighterCharacter {
    public Barbarian(String name, int wallet, int healthLevel, Weapons weapons) {
        super(name, wallet, healthLevel, weapons);
    }

    @Override
    public Weapons changeWeapon(Weapons weapons) {
        return super.changeWeapon(weapons);
    }
}
