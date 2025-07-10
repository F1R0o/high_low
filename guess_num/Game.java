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
        gameOver = false;

    }

    public String checkGuess(int userGuess){
        attempts--;
        CheckAttempts();
        System.out.println("you have left" + attempts + " attempts");
        if(userGuess == numberToGuess){
            gameOver = true;
            return "you are correct  you guessed it";
        }
        else if (userGuess < numberToGuess){
            return "low";
        }



        else{
            return "high";
        }


    }

    public int checkLevel(String level){
        if(level.equals("easy".trim().toLowerCase())){
            return attempts = 15;


        }else if(level.equals("medium".trim().toLowerCase())){
            return  attempts = 10;
        }
        else if(level.equals("hard".trim().toLowerCase())){
            return attempts = 5;
        }
        else {
            System.out.println("please choose easy/medium/hard");
            return 0;
        }
    }


    public void CheckAttempts(){
        if(attempts == 0){
            gameOver = true;
            System.out.println("game over you lost!");

        };

    }
    public boolean isGameOver(){
        return gameOver;
    }


}


