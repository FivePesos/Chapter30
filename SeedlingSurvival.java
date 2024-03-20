import java.util.Random;
class SeedlingSurvival {
    public static void main(String[] args) {
        Random rand = new Random();
        double percentage = 0;
        int alive = 0;
        
        for(int i = 1; i <= 100; i++){
            System.out.println("Season: "+ i);
            for(int j = 1; j <= 10; j++){
                int random = rand.nextInt(10 - 1 + 1) + 1; // Setting Minimum and Maximum equation according to programmedlessons.org
                String isAlive = "Dead";
                if(random < 10){
                    isAlive = "Alive";
                    alive++;
                }
                System.out.println("Value of rolled dice is " + random + ". Plant " + j + " is " + isAlive);
            }
        }
        percentage = (alive / 100.0) * 10.0;
        System.out.printf("\nThe average of alive plants is %.2f%%", percentage);
    
    }
}
