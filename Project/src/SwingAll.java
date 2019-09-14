import javax.swing.*;

class HighRock{

    public HighRock() {
        utilsLob();
    }
        private void  utilsLob() {
            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setSize(444, 400);

        }


}

public class SwingAll {

    public static void main(String ...agrs){
        HighRock hr = new HighRock();

    }
}
