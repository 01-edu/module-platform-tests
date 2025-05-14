public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public void attack(Character character) {
        if(this.getWeapon() != null)
            character.takeDamage(this.getWeapon().getDamage());
        else
            character.takeDamage(7);
    }

    @Override
    public void takeDamage(int damage) {
        int reducedDamage = (int) Math.floor(0.8 * damage);
        setCurrentHealth(Math.max(getCurrentHealth() - reducedDamage, 0));
    }

    @Override
    public String toString() {
        String s;
        if (getCurrentHealth() > 0) {
            s = getName() + " is a monster with " + getCurrentHealth() + " HP";
        } else {
            s = getName() + " is a monster and is dead";
        }
        if (this.getWeapon() != null)
            s += " He has the weapon " + this.getWeapon();
        return s;
    }
}
