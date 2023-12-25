import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = getInput(scanner);
        int b = getInput(scanner);
        int c = getInput(scanner);

        scanner.close();
        if (validtriangle(a, b, c)) {
            System.out.println("You can form a triangle with these lengths.");
        } else {
            System.out.println("You cannot form a triangle with these lengths.");
        }
    }

    public static int getInput(Scanner scanner) {
        int length;
        do {
            System.out.print("Enter a positive integer length: ");
            length = scanner.nextInt();
        } while (length <= 0);
        return length;
    }

    public static boolean validtriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
