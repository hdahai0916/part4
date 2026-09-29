package part4.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();
        try{
        characters.add(CharacterFactory.getCharacter(CharacterType.SABER));
        characters.add(CharacterFactory.getCharacter(CharacterType.ARCHER));
        characters.add(CharacterFactory.getCharacter(CharacterType.CASTER));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        for(Character character : characters) {
            character.attack();
        }
    }
}
