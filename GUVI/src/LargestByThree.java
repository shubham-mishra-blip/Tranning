import java.util.Scanner;

public class LargestByThree {

    public static void main(String args[]){

        //initialize Scanner
        Scanner lo = new Scanner(System.in);

        //Take 3 input
        System.out.println("Enter First Number = ");
        int num1 = lo.nextInt();
        System.out.println("Enter Sencond Number = ");
        int num2 = lo.nextInt();
        System.out.println("Enter Third Number = ");
        int num3 = lo.nextInt();

        //Operation
        int box = num2;
        if(num1 > num2 && num1 > num3){
            box = num1;
        }
        else if (num2 < num3){
            box = num3;}



        System.out.println("Largest Number is = " + box);

    }
}
