import java.util.Scanner;

class Array2DRegular {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] a= new int[4][3];

        for (int i=0;i<=a.length-1;i++){
            for (int j=0;j<=a[i].length-1;j++){
                System.out.println("Enter Your marks");
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println(" \n\n\n\n\n");

        System.out.println(" -----------------------");

//        for (int i=0;i<=a.length-1;i++){
//            for (int j=0;j<=a[i].length-1;j++){
//
//                if (i==0){
//                    System.out.print(" | "+a[i][j]+" | ");
//                }
//               else if (i!=0){
//                   System.out.println();
//                   if (i==1) {
//                       System.out.print(" | " + a[i][j] + " | ");
//                   }
//                }
//
//            }
//        }

        for (int i=0;i<=a.length-4;i++){
            for (int j=0;j<=a[i].length-1;j++){
                System.out.print(" | "+a[i][j]+" | ");
            }
        }
        System.out.println();
        for (int i=1;i<=a.length-3;i++){
            for (int j=0;j<=a[i].length-1;j++){
                System.out.print(" | "+a[i][j]+" | ");
            }
        }
        System.out.println();
        for (int i=2;i<=a.length-2;i++){
            for (int j=0;j<=a[i].length-1;j++){
                System.out.print(" | "+a[i][j]+" | ");
            }
        }
        System.out.println();
        for (int i=3;i<=a.length-1;i++){
            for (int j=0;j<=a[i].length-1;j++){
                System.out.print(" | "+a[i][j]+" | ");
            }
        }
        System.out.println(" \n-----------------------");


    }
}
