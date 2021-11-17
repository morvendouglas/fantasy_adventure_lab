package characters.magicUserCharacters;

import actions.attacks.Weapons;
import actions.defences.MythicalCreatures;

public class Wizard extends MagicUserCharacter{
    public Wizard(String name, int wallet, int healthLevel, Weapons weapons, MythicalCreatures mythicalCreatures) {
        super(name, wallet, healthLevel, weapons, mythicalCreatures);
    }
}
