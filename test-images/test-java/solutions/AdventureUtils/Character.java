import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int amount) {
        currentHealth -= amount;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public void attack(Character target) {
        target.takeDamage(9);
    }

    @Override
    public String toString() {
        if (currentHealth == 0) {
            return name + " : KO";
        } else {
            return name + " : " + currentHealth + "/" + maxHealth;
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

    public static Character fight(Character character1, Character character2) {
        while(character1.currentHealth > 0 && character2.currentHealth > 0) {
            character1.attack(character2);
            if (character2.currentHealth > 0) {
                character2.attack(character1);
            }
        }
        if (character1.currentHealth <= 0)
            return character2;
        return character1;
    }
}
