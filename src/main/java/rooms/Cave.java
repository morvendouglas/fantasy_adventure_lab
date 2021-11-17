package rooms;

import rooms.enemies.Enemies;
import rooms.treasures.Treasures;

import java.util.ArrayList;

public class Cave  extends Room{
    public Cave(String name, Treasures treasures, Enemies enemies) {
        super(name, treasures, enemies);
    }
}
