package part4.task3;

public class CharacterFactory {
    public static Character getCharacter(CharacterType type) throws IllegalArgumentException {
        switch (type) {
            case SABER -> {
                return new Saber();
            }
            case ARCHER -> {
                return new Archer();
            }
            case CASTER -> {
                return new Caster();
            }
            default -> throw new IllegalArgumentException("未知的角色类型: " + type);
        }
}}