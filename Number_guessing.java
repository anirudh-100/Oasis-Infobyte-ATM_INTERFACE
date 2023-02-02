
//Number Guessing Game
import java.util.Scanner;

class NumberGuessing{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Getting random number using random function from math library..
        int mynum = (int)(Math.random()*50); 
        
        int guess ;
        int attempt=0; 
        int repeat=1;

        do{
            System.out.print("Guess the number : ");
            //Taking input of number
            guess = sc.nextInt();

            if(guess == mynum){
                System.out.println("Congrats! You guess the right number.\n");
                System.out.print("You have guess the number in ");
                System.out.print(attempt);
                System.out.println(" attempts..");

                attempt = 0;
                System.out.print("Do you want to play again(1/0) : ");
                
                repeat = sc.nextInt();
                mynum = (int)(Math.random()*50);

                System.out.println();
            }

            else if(guess > mynum)
                System.out.println("Your number is too large.\n");

            else
                System.out.println("Your number is too small.\n");

            attempt++;

        }while(repeat != 0);

        System.out.println("Thanks for playing");
        sc.close();
    }
}
