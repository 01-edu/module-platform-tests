import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private final Weapon weapon;
    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.weapon = weapon;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    protected void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    
    public abstract void attack(Character character) throws DeadCharacterException;

    public abstract void takeDamage(int damage) throws DeadCharacterException;

    public static Character fight(Character character1, Character character2) {
        while(true) {
            try {
                character1.attack(character2);
                character2.attack(character1);
            } catch (DeadCharacterException e) {
                return e.getCharacter();
            }
        }
    }

    public static String printStatus() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("------------------------------------------\n");
        if (allCharacters.isEmpty()) {
            stringBuilder.append("Nobody's fighting right now !\n");
        } else {
            stringBuilder.append("Characters currently fighting :\n");
            for (Character character : allCharacters) {
                stringBuilder.append(" - ").append(character.toString()).append("\n");
            }
        }
        stringBuilder.append("------------------------------------------\n");
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        if (currentHealth == 0) {
            return name + " : KO";
        } else {
            return name + " : " + currentHealth + "/" + maxHealth;
        }
    }
}
