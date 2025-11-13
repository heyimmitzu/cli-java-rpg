public class Player extends Character{
    private double mana;

    public Player(String name, PlayerClass className)
    {
        this.name = name;
        this.level = 0;
        this.attack = className.getBaseAttack();
        this.health = className.getBaseHealth();
        this.mana = className.getBaseMana();
    }

    @Override
    public void basicAttack(Character target) {
        target.takeDamage(attack);
    }
}
