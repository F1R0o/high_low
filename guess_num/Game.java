package guess_num;
import  java.util.Random;

public class Game {
    private int numberToGuess;
    private int attempts;
    private boolean gameOver;


    public Game(){
        reset();
    }


    public void reset(){
        Random rand = new Random();
        numberToGuess = rand.nextInt(1,100);
        attempts = 0;
        gameOver = false;


    }

    public String checkGuess(int userGuess){
        attempts ++;
        if(userGuess == numberToGuess){
            gameOver = true;
            return "you are correct  you guessd it in "  + attempts + "attempts";
        }
        else if (userGuess < numberToGuess){
            return "low";
        }
        else {
            return "high";
        }
    }

    public boolean isGameOver(){
        return gameOver;
    }
}


