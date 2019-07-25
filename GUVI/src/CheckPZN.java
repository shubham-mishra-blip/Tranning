import java.util.Scanner;

public class CheckPZN {

    public static void main(String args[]){

        //specify scanner
        Scanner de = new Scanner(System.in);

        //taking input
        System.out.print("Enter a Number = ");
        int num = de.nextInt();

        //Check whether a number is pos+ or neg- or 0
        if (num <1){
            System.out.print("Negative");
        }
        else if(num == 0){
            System.out.print("ZERO");
        }
        else
            System.out.print("Positive");

    }
}
