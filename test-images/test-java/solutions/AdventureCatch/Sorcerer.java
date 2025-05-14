public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character character) throws DeadCharacterException{
        if (getCurrentHealth() <= 0)
            throw new DeadCharacterException(this);
        int newHealth = character.getCurrentHealth() + healCapacity;
        int maxHealth = character.getMaxHealth();
        character.setCurrentHealth(Math.min(newHealth, maxHealth));
    }

    @Override
    public void attack(Character character) throws DeadCharacterException{
        if (getCurrentHealth() <= 0)
            throw new DeadCharacterException(this);
        heal(this);
        if(this.getWeapon() != null)
            character.takeDamage(this.getWeapon().getDamage());
        else
            character.takeDamage(10);
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException{
        if (getCurrentHealth() <= 0)
            throw new DeadCharacterException(this);
        setCurrentHealth(Math.max(getCurrentHealth() - damage, 0));
    }

    @Override
    public String toString() {
        String s;
        if (getCurrentHealth() > 0) {
            s = getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP.";
        } else {
            s = getName() + " is a dead sorcerer. So bad, it could heal " + healCapacity + " HP.";
        }
        if (this.getWeapon() != null)
            s += " He has the weapon " + this.getWeapon();
        return s;
    }
}
