import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Fortune");
	String fortune = "default fortune";
	public static void main(String[] args){
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();
	} 
	
	public void showButton(){
		frame.setVisible(true);
		frame.add(button);
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		
			if (rand == 0) {
				fortune = "You will soon come into wealth";
			} if (rand == 1) {
				fortune = "You will eat a super rad burrito at some point next week";
			} if (rand == 2) {
				fortune = "You will soon find love";
			} if (rand == 3) {
				fortune = "You will find that really cool hat you thought you lost";
			}
			
			JOptionPane.showMessageDialog(frame, fortune);

	}
}
