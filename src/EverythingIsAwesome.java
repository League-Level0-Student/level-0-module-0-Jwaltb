import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog(null, "What do you like?");
		JOptionPane.showMessageDialog(null, input + " is awesome");
	}

}
