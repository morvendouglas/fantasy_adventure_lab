package rooms;

import rooms.enemies.Enemies;
import rooms.treasures.Treasures;

import java.util.ArrayList;

public class Castle extends Room {
    public Castle(String name, Treasures treasures, Enemies enemies) {
        super(name, treasures, enemies);
    }
}
