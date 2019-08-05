import java.util.Scanner;

public class HelloN {

    public static void main(String args[]){

        //initialize Scanner
        Scanner lo = new Scanner(System.in);

        //Take input
        System.out.println("Enter number");
        int num = lo.nextInt();

        //Looping
        for (int i =1 ; i<=num; i++){
            System.out.println("Hello :)");
        }
    }
}

