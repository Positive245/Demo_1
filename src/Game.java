public class Game {
    public static void main(String[] args) {
        // Create and initialize two Player objects
        Player player1 = new Player("Player 1", 0, 1, 100.0);
        Player player2 = new Player("Player 2", 0, 1, 100.0);

        // Call various methods to change attributes for each player
        player1.updateScore(50);
        player2.updateScore(75);

        player1.levelUp();
        player2.levelUp();

        player1.hitHealth();
        player2.hitHealth();

        // Print both players' attributes
        player1.printInfo();
        player2.printInfo();
    }
}