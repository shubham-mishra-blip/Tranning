import java.util.Scanner;

class Warrior extends Thread {

    String res1 = "Brahmastra";
    String res2 = "Sarpastra";
    String res3 = "Pushupatastra";

    @Override
    public void run() {

        try {
            if (Thread.currentThread().getName() == "Rama") {
                ravaAccRes();
            } else ravanaAccRed();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    void ravaAccRes() throws InterruptedException {
        synchronized (res1) {
            System.out.println("Rama accuired " + res1);
            Thread.sleep(5000);
            synchronized (res2) {
                System.out.println("Rama Accuired " + res2);
                Thread.sleep(5000);
                synchronized (res3) {
                    System.out.println("Rama accuired " + res3);
                    Thread.sleep(5000);
                }
            }
        }
    }

    void ravanaAccRed() throws InterruptedException {
        synchronized (res1) {
            System.out.println("Ravana accuired " + res1);
            Thread.sleep(5000);
            synchronized (res2) {
                System.out.println("Ravana accuired" + res2);
                Thread.sleep(5000);
                synchronized (res3) {
                    System.out.println("Ravana accuired" + res3);
                    Thread.sleep(5000);
                }
            }
        }
    }
}

public class Multi_Handling_State {
        public static void main(String[] args) {
            Warrior w1 = new Warrior();
            Warrior w2 = new Warrior();

            w1.setName("Rama");
            w2.setName("Ravana");

            w1.start();
            w2.start();
        }
    }


