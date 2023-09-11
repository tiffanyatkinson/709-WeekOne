import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        int guess;
        int answer;

        System.out.println ("I'm thinking of a number between 1 and 100");
        System.out.println ("(including both). Can you guess what it is?");
        Scanner in = new Scanner(System.in);
        System.out.print ("Type a number: ");
        guess = in.nextInt();
        System.out.println("Your guess is: " + guess);

        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.print("The number I was thinking of is: ");
        System.out.println(number);

        answer = guess - number;
        System.out.print ("You were off by: ");
        System.out.println (answer);
        

        in.close();
    }

}