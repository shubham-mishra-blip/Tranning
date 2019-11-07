import java.util.Scanner;

//Demo1
class Demo1{
    void banking() {
        System.out.println("Banking Operation Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        int u = sc.nextInt();
        System.out.println("Enter Password");
        int p = sc.nextInt();
        System.out.println("Succesfully Login! Take your money");
        System.out.println("Backing opertion Ended");
    }
}

//Demo2
class Demo2{
    void printing() throws InterruptedException{
        System.out.println("printing Operation Started");
        int i = 0;
        while(i < 5) {
            System.out.println("Hello Java");
            Thread.sleep(3000);
            i++;
        }
        System.out.println("printing opertion Ended");
    }
}

//Demo3
class Demo3{
    void adding(){
        System.out.println("Adding Operation Started");
        int i = 50;
        int j = 20;
        System.out.println(i+j);
        System.out.println("Adding opertion Ended");
    }
}


public class SingleThread {

    public static void main(String[] args) throws InterruptedException{
        // TODO Auto-generated method stub
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        d1.banking();
        d2.printing();
        d3.adding();

    }

}
