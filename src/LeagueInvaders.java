import javax.swing.JFrame;

public class LeagueInvaders {

	GamePanel panel = new GamePanel();
	
	LeagueInvaders(){
		setup();
	}
	
	public static void main(String[] args){
		new LeagueInvaders();
		
	}
	
	void setup(){
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setSize(500, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.StartGame();
		frame.addKeyListener(panel);
	}
}
