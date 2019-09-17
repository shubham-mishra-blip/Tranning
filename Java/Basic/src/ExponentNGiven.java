import java.util.Scanner;

public class ExponentNGiven {

    public static void  main(String ags[]){

        int total=1;

        //initialize Scanner
        Scanner lo= new Scanner(System.in);

        //take 2 input
        System.out.println("Enter 1st number= ");
        int num1 = lo.nextInt();
        System.out.println("Enter 2 nd number");
        int num2 = lo.nextInt();
        System.out.println("\n \n You have enter = " + num1+"^"+num2);


        //operation
        while(num2 >= 1){
            total *= num1;
            num2--;
        }
        System.out.println("Ans = " + total);
    }
}
