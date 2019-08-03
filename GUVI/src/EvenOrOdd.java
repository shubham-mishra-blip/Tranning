import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String args[]){

        //Initialise Scanner
        Scanner lo = new Scanner(System.in);

        //Taking Input
        System.out.println("Enter any Number");
        int num = lo.nextInt();

        //CHECKING Even or Odd
        if (num % 2 == 0){
            System.out.print("Number is Even");
        }
        else
            System.out.print("Number is Odds");
    }
}
