import java.util.Scanner;

public class LeapHai {

    public static void main(String args[]){

        //Initialize Scanner
        Scanner lo = new Scanner(System.in);

        //Take Input from end user
        System.out.println("Enter Year");
        int yer = lo.nextInt();

        //Checking
        if (yer % 400 == 0){
            System.out.println("This year is Leap Year");
        }
        else if(yer % 100 == 0){
            System.out.println("This is not a leap year");
        }
        else if (yer % 4 == 0){
            System.out.println("This year is Leap Year");
        }
        else
            System.out.println("Sorry, This is not leap Year :)");
    }
}
