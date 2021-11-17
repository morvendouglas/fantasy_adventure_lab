package characters.magicUserCharacters;

import actions.attacks.Weapons;
import actions.defences.MythicalCreatures;
import characters.fighterCharacters.FighterCharacter;

public abstract class MagicUserCharacter extends FighterCharacter {

    private MythicalCreatures mythicalCreatures;

    public MagicUserCharacter(String name, int wallet, int healthLevel, Weapons weapons, MythicalCreatures mythicalCreatures) {
        super(name, wallet, healthLevel, weapons);
        this.mythicalCreatures = mythicalCreatures;
    }

    public MythicalCreatures getMythicalCreatures() {
        return mythicalCreatures;
    }
}
