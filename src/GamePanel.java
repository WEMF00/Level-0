import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;




public class GamePanel extends JPanel implements ActionListener, KeyListener{
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
		Timer time = new Timer( 1000/60, this);

		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
			if(currentState == MENU_STATE){
				updateMenuState();
			}else if(currentState == GAME_STATE){
				updateGameState();
			}else if(currentState == END_STATE){
				updateEndState();
			}

			
		}
		
		void StartGame(){
			time.start();
		}
		
		public void paintComponent(Graphics g){
			if(currentState == MENU_STATE){
				drawMenuState(g);
			}else if(currentState == GAME_STATE){
				drawGameState(g);
			}else if(currentState == END_STATE){
				drawEndState(g);
			}

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("A message to the console");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
			if (e.getKeyCode() == KeyEvent.VK_ENTER){
				currentState += 1; 
				System.out.println("A message to the console");
				if(currentState > END_STATE){
					currentState = MENU_STATE;
				}

			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("A message to the console");
		}
		
		public void updateMenuState(){
			
		}
		public void updateGameState(){
			
		}
		
		public void updateEndState(){
			
		}
		
		public void drawMenuState(Graphics g){
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, 500, 800);

		}
		public void drawGameState(Graphics g){
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, 500, 800);
		}
		
		public void drawEndState(Graphics g){
			g.setColor(Color.RED);
			g.fillRect(0, 0, 500, 800);
		}
}
