package guess_num;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scanner  = new Scanner(System.in);
    Game game = new Game();

    System.out.println("Welcome to Game");

    while(true) {
        System.out.println("enter a guess");
        int userGuess;


        try {
            userGuess = Integer.parseInt(scanner.nextLine());


        }catch (NumberFormatException e){
            System.out.println("Please enter a number");
            continue;
        }

        String result  = game.checkGuess(userGuess);
        System.out.println(result);
        if (game.isGameOver()) {
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();
            if (playAgain.equals("yes") || playAgain.equals("y")) {
                game.reset();
                System.out.println("\nNew game started! Guess a number between 1 and 100.");
            } else {
                System.out.println("👋 Thanks for playing!");
                break;
            }
        }


    }
}
}
