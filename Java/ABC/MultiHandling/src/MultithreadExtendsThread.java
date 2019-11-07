import java.util.Scanner;

//Demo1
class Demo4 extends Thread{

    //Set thread name without using .setName()
    Demo4(){
        super("Bank");
        System.out.println(this);
    }
    public void run() {

        System.out.println("Banking Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        int u = sc.nextInt();
        System.out.println("ENter Password");
        int p = sc.nextInt();
        System.out.println("Successful Login! Take your money");
        System.out.println("Banking Ended");
    }
}


//Demo2
class Demo5 extends Thread{

    public void run() {
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
}

//Demo3
class Demo6 extends Thread{

    public void run() {
        System.out.println("adding Started");
        int i = 10;
        int j = 30;
        System.out.println(i+j);
        System.out.println("adding Ended");
    }
}

public class MultithreadExtendsThread {

    public static void main(String[] args) throws InterruptedException{
        // TODO Auto-generated method stub
        Demo4 d1 = new Demo4();
        Demo5 d2 = new Demo5();
        Demo6 d3 = new Demo6();
        System.out.println(d1.getName());
        d1.start();
        d2.start();
        d3.start();

    }

}
