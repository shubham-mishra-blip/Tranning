import java.util.Scanner;

public class NaturalSum {

    public static void  main(String args[]){

        //initialize Scanner
        Scanner lo = new Scanner(System.in);

        int sum=0 ;


        //Take input
        System.out.println("ENter any number");
        int num = lo.nextInt();

        //operation
        if (num < 0){
            System.out.println("You have enter a number is not a Natural Number");
        }
        else if (num > 0){
            while (num >= 1) {
                sum += num;
                num--;

            }
            System.out.println("Answer is = " + sum);
        }
    }
}
