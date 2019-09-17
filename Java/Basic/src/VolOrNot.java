import java.util.Scanner;
import java.lang.String;

public class VolOrNot {

    public static  void main(String args[]){

        //Initialise Scanner
        Scanner lo = new Scanner(System.in);

        //Take input
        System.out.println("Enter Any Alphabet");
        char ch =lo.next().charAt(0);

        //Check
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
                || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

            System.out.print("Alphabet is Vowel");
        }
        else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%'||ch == ')' || ch == '(' || ch == '*' || ch == '&' || ch == '^'){
            System.out.print("Invalid Value");
        }
        else
            System.out.print("Alphabet is Consonant");
    }
}
