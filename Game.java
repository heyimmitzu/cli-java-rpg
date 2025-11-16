public class Game {
    Player player;
    boolean running = true;

    public void startGame() {
        System.out.println("Welcome to CLI-RPG!");
        player = characterCreation();
        while(running) {
            printMainMenu();
            int choice = InputHandler.readIntRange("What do you want to do?", 1, 4);
            
            switch (choice) {
                case 1:
                    enterDungeon();
                break;
                
                case 2:
                    enterTavern();
                break;
                
                case 3:
                    openInventory();
                break;
                
                case 4:
                    saveGameQuit();
                break;
            }
        }
    }

    public Player characterCreation() {
        String name = InputHandler.readStringToUpper("Enter character name: ");
        PlayerClass.displayClasses();
        int classChoice = InputHandler.readIntRange("Chose a class:", 1, PlayerClass.values().length);
        System.out.println("Welcome, " + name + " the "+ PlayerClass.fromMenuNumber(classChoice) + "!");
        return new Player(name, PlayerClass.fromMenuNumber(classChoice));
    }

    public void printMainMenu()
    {
        System.out.println("\n=== Town ===");
        System.out.println("1) Enter dungeon");
        System.out.println("2) Go to tavern (rest & small XP)");
        System.out.println("3) Open inventory");
        System.out.println("4) Save & quit");
    }

    public void enterDungeon() {
        System.out.println("Dungeon");
    }

    public void enterTavern() {
        System.out.println("Tavern");
    }

    public void openInventory() {
        System.out.println("Inventory");
    }

    public void saveGameQuit() {
        System.out.println("Save and quit");
    }
}