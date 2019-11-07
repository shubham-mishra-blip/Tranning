class MicrosoftWord extends Thread{
    @Override
    public void run() {
        try {
            if (Thread.currentThread().getName() == "Write") {
                writting();
            } else if (Thread.currentThread().getName() == "Spellcheck") {
                spellcheck();
            } else {autosaving();}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Writting Method
    void writting() throws InterruptedException{
        int n = 5;
        while (n > 0) {
            System.out.println("Writting Operation is going on");
            Thread.sleep(3000);
            n --;
        }
    }

    //SpellCheck Method
    void spellcheck()throws InterruptedException{
        int n = 5;
        while (n > 0) {
            System.out.println("Spell Check Operation is going on");
            Thread.sleep(3000);
            n --;
        }
    }


    //Autosaving Method
    void autosaving() throws InterruptedException{
        int n = 5;
        while (n > 0) {
            System.out.println("Auto-Saving Operation is going on");
            Thread.sleep(3000);
            n --;
        }
    }
}

public class RaceConditionInMultiThreading {
    public static void main(String[] args) {
        System.out.println("Main Function Started");
        MicrosoftWord m1 = new MicrosoftWord();
        MicrosoftWord m2 = new MicrosoftWord();
        MicrosoftWord m3 = new MicrosoftWord();

        m1.setName("Write");
        m2.setName("Spellcheck");
        m3.setName("Autosaving");

        m1.start();
        m2.start();
        m3.start();

        System.out.println("Main FUnction Terminated");
    }
}
