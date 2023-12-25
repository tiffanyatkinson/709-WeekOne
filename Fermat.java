import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c,n;

        System.out.print("Enter value for a: ");
        a = scan.nextInt();

        System.out.print("Enter value for b: ");
        b = scan.nextInt();

        System.out.print("Enter value for c: ");
        c = scan.nextInt();

        System.out.print("Enter value for n: ");
        n = scan.nextInt();

        if((Math.pow(a,n)+Math.pow(b,n))==Math.pow(c,n)){
            System.out.println("Holy smokes, Fermat was Wrong!");
        }
        else{
            System.out.println("No, that doesn't work.");
        }

    }
}
    

