import java.util.*;
public class ImprovedGuessingGame {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        final byte LIMIT = 3;
        int guess, attempt = 0;
        int randNum = rand.nextInt(10) + 1;
        
        System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.");

        System.out.println("Enter a guess: ");
        do{
            guess = scan.nextByte();
           
            if (guess - randNum >= 3 || guess - randNum <= -3){
                attempt++;
                if(attempt <= 2) //If the attempt is == 3 it will go outside the loop printing wrong instead of cold,warm,hot as shown in the example number 2 of the instruction
                    System.out.println("cold");     
            }
            else if (guess - randNum == 2 || guess - randNum == -2){
                attempt++;
                if(attempt <= 2)
                    System.out.println("warm");
            }
            else if (guess - randNum == 1 || guess - randNum == -1 ){
                attempt++;
                if(attempt <= 2)
                    System.out.println("hot");
            }
            else
                System.out.println("RIGHT!");

            
        }while(attempt < LIMIT && guess != randNum);

        if(attempt == LIMIT){
            System.out.println("wrong.");
            System.out.println("The correct number was " + randNum);
            System.out.println("You have lost the game.");
        }
        scan.close();
        
        
    }   
}
