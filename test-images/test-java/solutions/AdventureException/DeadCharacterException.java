public class DeadCharacterException extends Exception {
    private final Character character;

    public DeadCharacterException(Character character) {
        this.character = character;
    }

    @Override
    public String getMessage() {
        return "The " + getCharacterType() + " " + character.getName() + " is dead.";
    }

    private String getCharacterType() {
        if (character instanceof Sorcerer) {
            return "sorcerer";
        } else if (character instanceof Monster) {
            return "monster";
        } else if (character instanceof Templar) {
            return "templar";
        } else {
            return "character";
        }
    }
}
