public abstract  class Character {
    protected double health;
    protected double attack;
    protected int level;
    protected String name;
    
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(double damage) {
        health -= damage;
    }

    public void heal(double heal) {
        health += heal;
    }

    public abstract void basicAttack(Character target);
}
