import java.util.*;

public class RevisedGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        byte score = 5;
        int guess;
        int randNum = rand.nextInt(10) + 1;
        System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.");
        System.out.println("Try to guess the number.\nYour beginning score is 5 points.\nEach time you guess wrong, your score is decreased by one.");
        do{
            System.out.println("Enter a guess: ");
            guess = scan.nextByte();
           
            Math.abs(guess);

            if(guess < randNum){
                score--; 
                System.out.println("Too Low! your score is now " + score);
            }else if(guess > randNum ){
                score--; 
                System.out.println("Too High! your score is now " + score);
            }
            
        }while(guess != randNum && score > 0);
        
        if(guess == randNum){
            System.out.println("You WON the game!");
        }
        System.out.println("Your score is " + score);
        scan.close();
    }
}
