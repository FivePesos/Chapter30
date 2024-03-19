// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Random;
class SeedlingSurvival {
    public static void main(String[] args) {
        Random rand = new Random();
        double percentage = 0;
        int alive = 0;
        String isAlive = "Alive";
        
        for(int i = 1; i <= 100; i++){
            System.out.println("Season: "+ i);
            for(int j = 1; j <= 10; j++){
                int random = rand.nextInt(10 - 1 + 1) + 1;
                if(random < 10){
                    isAlive = "Alive";
                    alive++;
                }
                else
                    isAlive = "Dead";
                System.out.println("Value of rolled dice is " + random + ". Plant " + j + " is " + isAlive);
            }
        }
        percentage = (alive / 100.0) * 10.0;
        System.out.println("The average of alive plants is " + percentage + "%");
    
    }
}
