package Src.Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Initialize game objects, player, etc.

        boolean isGameActive = true;
        while (isGameActive) {
            // Update game state
            // Handle user input
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            switch (userInput) {
                case "apple":
                    System.out.println("You selected Option 1");
                    break;
                case "uhe":
                    System.out.println("You selected Option 2");
                    break;
                case "rjueg":
                    System.out.println("You selected Option 3");
                    break;
                case "jef":
                    System.out.println("Exiting menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            input.close();
            // Render the game

            // Check for game end conditions to update isGameActive
        }
    }
}