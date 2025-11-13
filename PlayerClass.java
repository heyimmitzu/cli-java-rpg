public enum PlayerClass {

    WARRIOR("Warrior", 120, 15, 10),
    MAGE("Mage", 80, 20, 20);
    

    // Properties
    private final String className;
    private final int baseHealth;
    private final int baseAttack; 
    private final int baseMana;

    private PlayerClass(String className, int baseHealth, int baseDamage, int baseMana) {
        this.className = className;
        this.baseHealth = baseHealth;
        this.baseAttack = baseDamage;
        this.baseMana = baseMana;
    }

    public static PlayerClass fromMenuNumber(int menuNumber) {
        if(menuNumber < 1 || menuNumber > values().length){
            throw new IllegalArgumentException("Invalid menu number: " + menuNumber);
        }
        return values()[menuNumber - 1];
    }

    public static void displayClasses() {
        System.out.println("Available Classes: ");
        int index = 1;
        for(PlayerClass playerClass : PlayerClass.values())
        {
            System.out.println(index + ". " + playerClass.getClassName());
            index++;
        }
    }

    public String getClassName()    {return className;}
    public double getBaseHealth()    {return baseHealth;}
    public double getBaseAttack()    {return baseAttack;}
    public double getBaseMana()    {return baseMana;}
}
