import org.jointheleague.graphical.robot.Robot;

public class ShapeMaker {
	public static void main(String[] args) {
		Robot ro = new Robot();
		ro.penDown();
		ro.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			ro.move(100);
			ro.turn(90);
		} ro.turn(45);
		ro.move(100);
		ro.turn(-45);
		for (int i = 0; i < 4; i++) {
			ro.move(100);
			ro.turn(90);
		} ro.move(100);
		ro.turn(-135);
		ro.move(100);
		ro.turn(225);
		ro.move(100);
		ro.turn(-45);
		ro.move(100);
		ro.turn(-225);
		ro.move(100);
		ro.turn(45);
		ro.move(100);
	}
	
}
