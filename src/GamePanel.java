import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
		Timer time = new Timer( 1000/60, this);
		GameObject object = new GameObject();

		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
			object.update();
			
		}
		
		void StartGame(){
			time.start();
		}
		
		public void paintComponent(Graphics g){
			object.draw(g);
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("A message to the console");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("A message to the console");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("A message to the console");
		}
}
