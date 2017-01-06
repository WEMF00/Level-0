import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CustomGreeter implements ActionListener{
	JFrame frame = new JFrame("Greeter");
	JButton input = new JButton();
	JButton output = new JButton();
	JPanel panel = new JPanel();
	String name = null;
	public static void main (String[] args){
		CustomGreeter greet = new CustomGreeter();
		greet.setup();
		
	}
	void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(input);
		panel.add(output);
		frame.pack();
		input.addActionListener(this);
		output.addActionListener(this);

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == input) {
			name = JOptionPane.showInputDialog("What is your name?");
		} else {
			JOptionPane.showMessageDialog(null, "Hello, " + name.toUpperCase() + ".");
		}
		
	}
}
