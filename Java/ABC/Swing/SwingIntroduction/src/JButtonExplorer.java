import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JButtonExplorer extends JFrame{
	public JButtonExplorer() {
		setVisible(true);
		setSize(400, 400);
		setLayout(null);
		
		JTextField tf = new JTextField();
		tf.setBounds(20,50,300,50);
		
		JButton b = new JButton("Click");
		b.setBounds(50, 100, 95, 30);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText("Welcome TO my JButton Programming");
				
			}
		});
		add(b);
		add(tf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButtonExplorer();
	}

}
