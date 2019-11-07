class MsWord extends Thread{
    @Override
    public void run() {
        try {


            if (Thread.currentThread().getName() == "Type") {
                typing();
            } else if (Thread.currentThread().getName() == "Spell") {
                spellcheck();
            } else
                autosaving();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //typing
    void typing() throws InterruptedException{
        for (int i = 0 ; i < 5; i ++){
            System.out.println("Typing Opertation is going On");
            Thread.sleep(3000);
        }
    }

    //spellchecking
    void spellcheck()throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Spell Checking Opertation is going On");
            Thread.sleep(3000);
        }
    }

    //void autosaving
    void autosaving()throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Auto-Saving Opertation is going On");
            Thread.sleep(3000);
        }
    }

}

public class RaceConditionToOvercome {
    public static void main(String[] args) {
        MsWord m1 = new MsWord();
        MsWord m2 = new MsWord();
        MsWord m3 = new MsWord();

        m1.setName("Type");
        m2.setName("Spell");
        m3.setName("Autosave");

        m2.setDaemon(true);
        m3.setDaemon(true);

        m1.setPriority(1);
        m2.setPriority(6);
        m3.setPriority(10);

        m1.start();
        m2.start();
        m3.start();

    }
}
