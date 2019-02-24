import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String happy =
JOptionPane.showInputDialog("Are you happy right now?");
	if (happy.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
		else if (happy.equals ("no")){
			String no =
		JOptionPane.showInputDialog("Do you want to be happy?");
		if (no.equals("yes")){
			JOptionPane.showMessageDialog(null, "Then change something.");
	
		}
		else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		}

}
}