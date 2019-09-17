import java.util.Scanner;

class Array2DJagged {

    public static void main(String ...args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("HOW MANY CLASS MARK YOU WANT TO STORE ON DATABASE? :)");
        int clas = scan.nextInt();
        System.out.println("Enter How many student mark wants to store? ");
        int stu = scan.nextInt();

        int[][] a = new int[clas][stu];

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println("Enter Student Marks one by one");
                a[i][j] = scan.nextInt();
            }
        }

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println("Student Marks: "+ a[i][j]);
            }
        }

    }
}
