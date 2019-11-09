class Washroom implements Runnable{
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

public class Demerits_OfMultiThreading {
    public static void main(String[] args) {

        Washroom w1= new Washroom();
        Washroom w2 = new Washroom();
        Washroom w3 = new Washroom();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w3);

        t1.setName("Boys");
        t2.setName("Girls");
        t3.setName("Other");

        t1.start();
        t2.start();
        t3.start();


     //In this program one resource is uses by multiple thread and change on their as their need or requirment this is not a better approch
     //their will be a problem of data redency. To overcome this problem we need to add lock when one thread enter and use the resounce
     //lock will be realese when thread will left the resource. We can do it by using Sychronize.

    }
}
