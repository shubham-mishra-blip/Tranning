class Washroom1 implements Runnable{
    @Override
    synchronized public void run() {
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

public class Demerite_Overcome {
    public static void main(String[] args) {
        Washroom1 w1= new Washroom1();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("Boys");
        t2.setName("Girls");
        t3.setName("Other");

        t1.start();
        t2.start();
        t3.start();
    }
}
