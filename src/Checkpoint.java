import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, input+" is also my favorite color!");
	Robot phil=new Robot("mini");
	for (int i = 0; i < 3; i++) {
		phil.setSpeed(10);
		phil.penDown();
		phil.setRandomPenColor();
		phil.setPenWidth(30);
		phil.turn(120);
		phil.move(100);
		
	}
	
	
}
}
