public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character character) {
        int newHealth = character.getCurrentHealth() + healCapacity;
        int maxHealth = character.getMaxHealth();
        character.setCurrentHealth(Math.min(newHealth, maxHealth));
    }

    @Override
    public void attack(Character character) {
        heal(this);
        character.takeDamage(10);
    }

    @Override
    public void takeDamage(int damage) {
        setCurrentHealth(Math.max(getCurrentHealth() - damage, 0));
    }

    @Override
    public String toString() {
        if (getCurrentHealth() > 0) {
            return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP.";
        } else {
            return getName() + " is a dead sorcerer. So bad, it could heal " + healCapacity + " HP.";
        }
    }
}
