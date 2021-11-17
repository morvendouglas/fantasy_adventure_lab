import actions.attacks.Weapons;
import characters.fighterCharacters.Dwarf;
import org.junit.Before;
import org.junit.Test;
import rooms.enemies.Enemies;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Enemies enemies;

    @Before
    public void before(){
        dwarf = new Dwarf("Tony", 10, 20, Weapons.AXE);
    }

    @Test
    public void hasName(){
        assertEquals("Tony", dwarf.getName());
    }

    @Test
    public void hasWallet(){
        assertEquals(10, dwarf.getWallet());
    }

    @Test
    public void hasHealthLevel(){
        assertEquals(20, dwarf.getHealthLevel());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapons.AXE, dwarf.getWeapons());
    }

    @Test
    public void canAttackEnemy(){
        assertEquals(20, dwarf.attack(Enemies.TROLL));
    }


}
