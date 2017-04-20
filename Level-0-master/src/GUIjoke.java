import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUIjoke implements ActionListener {
	JFrame jokes = new JFrame("Joke");
	JButton jokeButton1 = new JButton();
	JButton jokeButton2 = new JButton();
	JPanel panel = new JPanel();

	
	public static void main(String[] args){
		GUIjoke GUI = new GUIjoke();
		GUI.setup();
	}
	
	void setup(){
		jokes.setVisible(true);
		//jokes.setSize(500, 250);
		jokes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jokes.add(panel);
		panel.add(jokeButton1);
		panel.add(jokeButton2);
		jokes.pack();
		jokeButton1.addActionListener(this);
		jokeButton2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jokeButton1) {
			JOptionPane.showMessageDialog(null, "Two peanuts walked into a park");
		} else {
			JOptionPane.showMessageDialog(null, "One was assaulted");
		}
	}
}
