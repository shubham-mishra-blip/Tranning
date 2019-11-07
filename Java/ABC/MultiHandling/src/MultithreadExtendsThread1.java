import java.util.Scanner;

//Demo
class Demo extends Thread{
    public void run() {
        if (Thread.currentThread().getName() == "Bank") {
            banking();
        }
        else if (Thread.currentThread().getName() == "Print") {
            printing();
        }
        else {
            adding();
        }
    }

    void banking() {
        System.out.println("Banking Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        int u = sc.nextInt();
        System.out.println("ENter Password");
        int p = sc.nextInt();
        System.out.println("Successful Login! Take your money");
        System.out.println("Banking Ended");
    }
    void printing() {
        System.out.println("Printing Started");
        try {
            int i = 0;
            while (i < 5) {
                System.out.println("Hello Java");
                Thread.sleep(3000);
                i ++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Printing Ended");
    }
    void adding() {
        System.out.println("adding Started");
        int i = 10;
        int j = 30;
        System.out.println(i+j);
        System.out.println("adding Ended");
    }

}
public class MultithreadExtendsThread1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        d1.setName("Bank");
        d2.setName("Print");
        d3.setName("Add");

        d1.start();
        d2.start();
        d3.start();
    }

}
