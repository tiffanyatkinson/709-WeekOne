import java.util.Scanner;

public class Time2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("State total number of seconds: ");

        int seconds = in.nextInt();
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;

        System.out.print(seconds + " seconds = ");
        System.out.println( H + " hours, " + M + " minutes, and " + S + " seconds");

        in.close();
    }




}