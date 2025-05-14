public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
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
    public int getShield() {
        return shield;
    }

    @Override
    public void attack(Character character) throws DeadCharacterException{
        if (getCurrentHealth() <= 0)
            throw new DeadCharacterException(this);
        heal(this);
        if(this.getWeapon() != null)
            character.takeDamage(this.getWeapon().getDamage());
        else
            character.takeDamage(6);
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException{
        if (getCurrentHealth() <= 0)
            throw new DeadCharacterException(this);
        int damageWithShield = Math.max(damage - shield, 0);
        setCurrentHealth(Math.max(getCurrentHealth() - damageWithShield, 0));
    }

    @Override
    public String toString() {
        String s;
        if (getCurrentHealth() > 0) {
            s = getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP and has a shield of " + shield + ".";
        } else {
            s = getName() + " has been beaten, even with its " + shield + " shield. So bad, it could heal " + healCapacity + " HP.";
        }
        if (this.getWeapon() != null)
            s += " He has the weapon " + this.getWeapon();
        return s;
    }
}