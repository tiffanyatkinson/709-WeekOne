import java.util.Random;
import java.util.Scanner;

public class chapterfive {
    public static void main(String[] args) {
    Random num = new Random();
    int answer = num.nextInt(100);
    int guess;


        System.out.println ("I'm thinking of a number between 1 and 100");
        System.out.println ("(including both). Can you guess what it is?");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print ("Type a number: ");
            guess = input.nextInt();
            System.out.println("Your guess is: " + guess);
            
            for (int i = 0; i < 2; i++) {
                if (guess < 1 || guess > 100){
                    System.out.println("That is not a valid entry. Please try again: ");
                    guess = input.nextInt();
                }else if (guess > answer){
                    System.out.println("Too high, Try Again!: ");
                    guess = input.nextInt();
                }else if (guess < answer){
                    System.out.println("Too low, Try Again!: ");
                    guess = input.nextInt();
                }
            }
        System.out.println ("Better luck next time!");
        }
        while (guess != answer);
        System.out.println("Congratulations, You guessed the number!");

    }
}

