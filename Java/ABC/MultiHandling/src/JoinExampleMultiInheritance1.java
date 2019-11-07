class Thread2 implements Runnable{
    Thread t1;
    Thread2() throws InterruptedException{
        t1 = new Thread(this,"Thread1");
        System.out.println(t1+" Started");
        t1.start();
        t1.join();         //NOTED
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i ++){
                System.out.println("I am first TO execute first");
                Thread.sleep(5000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Thread3 implements Runnable{

    Thread t2;
    Thread3() throws InterruptedException{
        t2 = new Thread(this,"Thread 2");
        System.out.println(t2+" Started");
        t2.start();
        t2.join();           //NOTED
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i ++){
                System.out.println("I am Second :'(");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class JoinExampleMultiInheritance1 {
    public static void main(String[] args) throws InterruptedException {
    Thread2 th1 = new Thread2();

    Thread3 th2 = new Thread3();

        System.out.println("Main class Ended");
    }
}
