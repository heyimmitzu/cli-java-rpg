public class Player extends Character {
    private double baseMana;
    private double baseHealth;
    private double mana;
    private int xp;
    private PlayerClass className;

    public Player(String name, PlayerClass className) {
        this.name = name;
        this.level = 1;
        this.xp = 0;
        this.baseAttack = className.getBaseAttack();
        this.baseHealth = className.getBaseHealth();
        this.health = baseHealth;
        this.baseMana = className.getBaseMana();
        this.mana = baseMana;
        this.className = className;
    }

    @Override
    public void basicAttack(Character target) {
        target.takeDamage(baseAttack);
    }

    public void checkLevelUp() {
        int xpNeeded = getXPForNextLevel();

        while(xp >= xpNeeded) {
            level++;
            xp -= xpNeeded;
            xpNeeded = getXPForNextLevel();
            onLevelUp();
        }
    }

    public void addXP(int xp) {
        this.xp += xp;
        checkLevelUp();
    }
    
    public int getXPForNextLevel() {
        return level * 100;
    }

    public void onLevelUp() {
        baseHealth += 10;
        baseAttack += 3;
        baseMana += 5;

        health = baseHealth;
        mana = baseMana;

        System.out.println("Congratulations, you reached Level " + level + "!");
        System.out.println("Stats gained: + 10 Base Health, + 3 Base Attack, + 5 Base Mana!");
    }

    public PlayerClass getClassName() {
        return className;
    }

    public double getBaseHealth() {
        return baseHealth;
    }

    public double getHealth() {
        return health;
    }

    public double getBaseAttack() {
        return baseAttack;
    }

    public double getBaseMana() {
        return baseMana;
    }

    public double getMana() {
        return mana;
    }

    public int getXP() {
        return xp;
    }

    public void setBaseHealth(double baseHealth) {
        if (baseHealth < 0) {
            throw new IllegalArgumentException("Base health cannot be negative");
        }
        this.baseHealth = baseHealth;
    }

    public void setHealth(double health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public void setBaseAttack(double baseAttack) {
        if (baseAttack < 0) {
            throw new IllegalArgumentException("Base attack cannot be negative");
        }
        this.baseAttack = baseAttack;
    }

    public void setBaseMana(double baseMana) {
        if (baseMana < 0) {
            throw new IllegalArgumentException("Base mana cannot be negative");
        }
        this.baseMana = baseMana;
    }

    public void setMana(double mana) {
        if (mana < 0) {
            this.mana = 0;
        } else {
            this.mana = mana;
        }
    }
}
