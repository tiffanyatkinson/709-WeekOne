import java.util.Scanner;

public class Abecedarian {
    public static boolean isAbecedarian(String string) {
        string = string.toLowerCase();
        for(int i = 0; i < string.length()-1; ++i) {
            if(string.charAt(i) > string.charAt(i+1)) {
                return false;
                }
        }
        return true;
    }
public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    String string;

    System.out.print("Please provide the string: ");
    string = scan.nextLine();
    if(isAbecedarian(string)) {
        System.out.println(string + " is abecedarian");
    } 
    else {

System.out.println(string + " is not abecedarian");
        }

    }

}
