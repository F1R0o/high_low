package guess_num;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scanner  = new Scanner(System.in);
    Game game = new Game();
    String level;


    System.out.println("Welcome to Game");
    System.out.println("please choose a level");
    level = scanner.nextLine();
    String levelResult = String.valueOf(game.checkLevel(level));

    while(true) {
        int userGuess;




        try {
            System.out.println("please enter a guess");
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

                System.out.println("Please choose a level: ");
                level = scanner.nextLine().trim().toLowerCase();
                game.checkLevel(level);
                System.out.println("\nNew game started! Guess a number between 1 and 100.");
            } else {
                System.out.println("👋 Thanks for playing!");
                break;
            }
        }


    }
}
}
