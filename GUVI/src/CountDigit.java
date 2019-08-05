import java.util.Scanner;

public class CountDigit {

    public static void main(String args[]){

        //initialize Scanner
        Scanner lo = new Scanner(System.in);

        //Take Input
        System.out.println("Enter any Number");
        int num = lo.nextInt();
        int count = 0;

        //Operation
        while (num != 0){
            num /= 10;
            count++;
        }
        System.out.println(count + " Times");
    }
}
