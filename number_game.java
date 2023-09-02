import java.util.Random;
import java.util.Scanner;

class number_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int low = 1;
        int up = 100;
        int tukka = random.nextInt(up - low + 1) + low;
        
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("\n\nWelcome to the Number Guessing Game!");
        System.out.println("\nI have selected a number between " + low + " and " + up + ". Try to guess it!");
        
        while (!hasGuessedCorrectly) {
            System.out.print("\nEnter your guess: ");
            int userGuess = sc.nextInt();
            numberOfTries++;
            
            if (userGuess < tukka) {
                System.out.println("\nToo low! Try a higher number.");
            } else if (userGuess > tukka) {
                System.out.println("\nToo high! Try a lower number.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("\nCongratulations! You've guessed the number " + tukka + " correctly!");
                System.out.println("\nIt took you " + numberOfTries + " tries.\n\n");
            }
        }
        
        sc.close();
    }
}
