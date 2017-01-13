import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Survey implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Roll");
	JLabel label1 = new JLabel("");
	JLabel label2 = new JLabel("");
	JPanel panel = new JPanel();
	JTextField textField = new JTextField(20);
	int total = 1000;
	public static void main(String[] args){
		
		Survey Surv = new Survey();
		Surv.setup();
		
		
	}
	
	void setup(){
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		panel.add(label1);
		panel.add(label2);
		panel.add(textField);
		//frame.setSize(400, 300);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null, "Hello World");
		String tf = textField.getText();
		int newtf = Integer.parseInt(tf);
		
		Random random = new Random();
		int dice1 = random.nextInt(6) + 1;
		int dice2 = random.nextInt(6) + 1;
		label2.setText("" + dice2);
		label1.setText("" + dice1);
		if (dice1 == dice2) {
			JOptionPane.showMessageDialog(panel, "Congratulations, you have " + total + " dollars");
			total = total + newtf;
		} else {
			total = total - newtf;
		}
		
		
	}
}
