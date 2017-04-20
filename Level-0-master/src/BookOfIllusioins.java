import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slide show of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusioins extends MouseAdapter {

	String mpp = "MPP.jpg";
	String panda = "Panda.jpg";
	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusioins illusions = new BookOfIllusioins();
		illusions.createBook();
	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame frame = new JFrame();
	private void createBook() {
		// 2. make the frame visible
		frame.setVisible(true);
		// 3. set the size of the frame
		frame.setSize(500, 500);
		// 4. find 2 images and save them to your project’s default package
		
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		JLabel pandaLabel = loadImageFromComputer(panda);
		// 7. use the "loadImage..." methods below to initialize your JLabel
		frame.add(pandaLabel);
		// 8. add your JLabel to the frame
		frame.pack();
		// 9. call the pack() method on the frame
		// 10. add a mouse listener to your frame (hint: use *this*)
		frame.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("CLicked");
		// 12. remove everything from the frame that was added earlier
		frame.removeAll();
		// 13. load a new image like before (this is more than one line of code)
		frame.setVisible(true);
		frame.setSize(500, 500);
		JLabel mppLabel = loadImageFromComputer(mpp);
		frame.add(mppLabel);
		frame.pack();
		frame.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 14. pack the frame
	}

// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

/*
 * To use this method, the image must be placed in your Eclipse project under "default package".
 */
public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}
}
