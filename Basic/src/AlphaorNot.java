import java.util.Scanner;

public class AlphaorNot {
    public static void main(String args[]){

        //initialize scanner
        Scanner lo = new Scanner(System.in);

        //Take input
        System.out.println("Entere any thing");
        char i = lo.next().charAt(0);

//
//        //Operation in Simple ways
//        char aa;
//        if(i == 'a'||i == 'b'||i == 'c'||i == 'd'||i == 'e'||i == 'f'||i == 'g'||i == 'h'||i == 'i'||i == 'j'||i == 'k'||i == 'l'||i == 'm'||i == 'n'||i == 'o'||i == 'p'||i == 'q'||i == 'r'||i == 's'||i == 't'||i == 'u'||i == 'v'||i == 'y'||i == 'z'){
//            System.out.println("You enter ALphabet");
//        }
//        else
//            System.out.println("You enter Number");


        //Using other ways
        if((i >= 'a' && i <='z') || (i >= 'A' && i <='Z')){
            System.out.println("Enter Value is Alphabet");
        }
        else
            System.out.println("Enter Valsu is Number ");


    }
}
