
import java.util.*;
class RandomNumber{
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        int maxAttempts=5;
        int roundsWon=0;
        int totalAttempts=0;
        boolean playAgain;
        do{
            int randomNumber=random.nextInt(100)+1;
            int userGuess=0;
            int attempt=0;
            boolean roundWon=false;
            while(userGuess!=randomNumber&&attempt<maxAttempts){
                System.out.println("Guess the number between 1 and 100");
                userGuess=sc.nextInt();
                attempt++;
                totalAttempts++;
                if(userGuess==randomNumber){
                    System.out.println("Congratulations!You guessed the correct number");
                    roundWon=true;
                }
                else if(userGuess>randomNumber){
                    System.out.println("Your guess is too high");
                }
                else{
                    System.out.println("Your guess is too low");
                }
                if(userGuess!=randomNumber&&attempt<maxAttempts){
                    System.out.println("Attempts remaining:"+(maxAttempts-attempt));

                }
                 
}
            
            if(roundWon){
                roundsWon++;
            }
            else{
                System.out.println("Sorry,you've used all your attempts.The correct number was"+randomNumber+".");
            }
            System.out.println("Would you like to play another round?(yes/no)");
            playAgain=sc.next().equalsIgnoreCase("yes");
        }while(playAgain);
        System.out.println("Game Over!");
        System.out.println("Round won:"+roundsWon);
        System.out.println("Total attempts taken:"+totalAttempts);
        sc.close();
        
    }
}