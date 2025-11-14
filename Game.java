public class Game {
    public void startGame() {
        System.out.println("Welcome to CLI-RPG!");
        characterCreation();
        
    }

    public Player characterCreation() {
        String name = InputHandler.readStringToUpper("Enter character name: ");
        PlayerClass.displayClasses();
        int classChoice = InputHandler.readIntRange("Chose a class:", 1, PlayerClass.values().length);
        System.out.println("Welcome, " + name + " the "+ PlayerClass.fromMenuNumber(classChoice) + "!");
        return new Player(name, PlayerClass.fromMenuNumber(classChoice));
    }
}