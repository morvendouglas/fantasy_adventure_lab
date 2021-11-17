import actions.attacks.Weapons;
import actions.defences.MythicalCreatures;
import characters.fighterCharacters.Dwarf;
import characters.magicUserCharacters.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Henry", 20, 10, Weapons.SWORD, MythicalCreatures.DRAGON);
    }

    @Test
    public void hasName(){
        assertEquals("Henry", warlock.getName());
    }

    @Test
    public void hasWallet(){
        assertEquals(20, warlock.getWallet());
    }

    @Test
    public void hasHealthLevel(){
        assertEquals(10, warlock.getHealthLevel());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapons.SWORD, warlock.getWeapons());
    }

    @Test
    public void hasMythicalCreature(){
        assertEquals(MythicalCreatures.DRAGON, warlock.getMythicalCreatures());
    }
}
