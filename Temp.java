import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        double C;
        double F;

        Scanner in = new Scanner(System.in);
            System.out.print("Enter a temperature in Celsius: ");
            C = in.nextDouble();
        

        F = C * 1.8 + 32;
        System.out.print(C + " C = ");
        System.out.println(F + " F ");

        in.close();
    }
}