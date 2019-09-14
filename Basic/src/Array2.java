import java.util.Scanner;

class Array1DJagged {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter How much you want to Create array and Store Value. You can do it :)");
        int num = sn.nextInt();
        int[] a= new int[num];
        int l = 1;

        for (int i =0;i<a.length; i++){
            System.out.println("Enter your"+(l+i)+"Subject Marks");
            a[i] = sn.nextInt();
        }
        for (int i =0;i<=a.length-1; i++){
            System.out.print("your"+(l+i)+"Subject Marks "+a[i]);
        }

    }
}
