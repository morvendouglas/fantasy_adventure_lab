import actions.attacks.Weapons;
import actions.defences.MythicalCreatures;
import characters.Character;
import characters.fighterCharacters.Dwarf;
import characters.magicUserCharacters.Wizard;
import org.junit.Before;
import org.junit.Test;
import rooms.Castle;
import rooms.enemies.Enemies;
import rooms.treasures.Treasures;

import static org.junit.Assert.assertEquals;

public class CastleTest {

    Castle castle;
    Character wizard;
    Dwarf dwarf;

    @Before
    public void before(){

        wizard = new Wizard("Harry", 20, 20, Weapons.AXE, MythicalCreatures.DRAGON);
        dwarf = new Dwarf("Tony", 10, 20, Weapons.AXE);
        castle = new Castle("Hogwarts", Treasures.GOLD, Enemies.TROLL);
    }

    @Test
    public void hasName(){
        assertEquals("Hogwarts", castle.getName());
    }

    @Test
    public void hasTreasures(){
        assertEquals(Treasures.GOLD, castle.getTreasures());
    }

    @Test
    public void hasEnemies(){
        assertEquals(Enemies.TROLL, castle.getEnemies());
    }

    @Test
    public void hasCharacters(){
        castle.addCharacter(wizard);
        castle.addCharacter(dwarf);
        assertEquals(2, castle.characterCount());
    }
}
