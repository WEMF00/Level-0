import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotSphere {
	public static void main(String[] args){
		Robot bot = new Robot();
		String l = JOptionPane.showInputDialog("Length of Sides:");
		String b = JOptionPane.showInputDialog("Number of sides");
		int sides = Integer.parseInt(b);
		int length = Integer.parseInt(l);
		bot.penDown();
		bot.setSpeed(10);
		if (sides > 360) {
			sides = 360;
		}
		for (int i = 0; i < sides; i++) {
			bot.move(length);
			bot.turn(360/sides);
		} bot.moveTo(0, 0);
	}
}
