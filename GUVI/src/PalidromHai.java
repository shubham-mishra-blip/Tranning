import java.util.Scanner;

public class PalidromHai {

    public static void main(String args[]) {

        int a, reverse = 0;

        //initialize Scanner
        Scanner lo = new Scanner(System.in);

        //Take Input
        System.out.println("Enter a number");
        int num = lo.nextInt();

        //Operation

        a = num;
        if (a <= 1000) {
            while (a != 0) {
                reverse *= 10;
                reverse = reverse + (a % 10);
                a = a / 10;
            }

            if (num == reverse) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
        else
            System.out.println("Not more than 1000");

    }
}
