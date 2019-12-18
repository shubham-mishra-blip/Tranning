import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwing extends JFrame{
	public FirstSwing() {
		// TODO Auto-generated constructor stub
		JButton b = new JButton("click");
		b.setBounds(130,100,100, 40);  	
		setSize(400, 500);
		
		add(b);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FirstSwing();
	}
}
	