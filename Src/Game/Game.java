package Src.Game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // Initialize game objects, player, etc.
        String userInput;
        Scanner input = new Scanner(System.in);

        // Runs game loop
        boolean isGameActive = true;
        while (isGameActive) {
            // Update game state

            // Handle user input

            userInput = input.nextLine();

            switch (userInput) {
                case "1":
                    System.out.println("You selected Option 1");
                    break;
                case "2":
                    System.out.println("You selected Option 2");
                    break;
                case "3":
                    System.out.println("You selected Option 3");
                    break;
                case "4":
                    System.out.println("Exiting menu...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            // Render the game
            
            // Check for game end conditions to update isGameActive
        }
    }
}