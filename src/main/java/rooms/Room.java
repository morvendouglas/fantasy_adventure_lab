package rooms;

import characters.Character;
import rooms.enemies.Enemies;
import rooms.treasures.Treasures;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private Treasures treasures;
    private Enemies enemies;
    private ArrayList<Character> characters;

    public Room(String name, Treasures treasures, Enemies enemies) {
        this.name = name;
        this.treasures = treasures;
        this.enemies = enemies;
        this.characters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Treasures getTreasures() {
        return treasures;
    }

    public Enemies getEnemies() {
        return enemies;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void addCharacter(Character character){
        characters.add(character);
    }

    public int characterCount(){
        return characters.size();
    }
}
