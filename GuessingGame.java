import java.util.*;

public class GuessingGame {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        final byte LIMIT = 3;
        byte guess, response = 0;
        int randNum = rand.nextInt(10) + 1;
        
        System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.");

        System.out.println("Enter a guess: ");
        do{
            guess = scan.nextByte();
            if(guess == randNum){
                System.out.println("Right");
            }
            else{
                System.out.println("Wrong");
                response++;
            }
        }while(response < LIMIT && guess != randNum);

        scan.close();
        
        if(response == LIMIT){
            System.out.println("The correct number was " + randNum);
            System.out.println("You have lost the game.");
        }
    }    
}
