class Washroom3 implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"Has Enter the Washroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" Has use washroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" has left the washroom");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Demerit_overcomeUsingJoin {
    public static void main(String[] args) throws InterruptedException{

        Washroom3 w1 = new Washroom3();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("Boys");
        t2.setName("Girls");
        t3.setName("Other");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
