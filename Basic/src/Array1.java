import java.util.Scanner;

class Array1DRegular {

    public static void main(String[] args) {
        int l = 1;
        int[] a = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <=a.length - 1; i++){

                System.out.printf("Enter Your "+(l+i)+" Subject: ");
                a[i]=scan.nextInt();

        }
        System.out.println(" --------------------------------------");

        for (int i = 0; i < a.length; i++){
                System.out.print(" | "+a[i]+" | ");
        }
        System.out.println("\n --------------------------------------");

    }
}
