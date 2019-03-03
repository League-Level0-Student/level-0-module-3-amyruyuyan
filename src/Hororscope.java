import javax.swing.JOptionPane;

public class Hororscope {
	public static void main(String[] args) {           
		String starsign = JOptionPane.showInputDialog("What is your star sign?");
if (starsign.equals("Aries")) {
JOptionPane.showMessageDialog(null, "You are courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.\n" + "");
}
else if (starsign.equals("Taurus")) {
	JOptionPane.showMessageDialog(null, "You are pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature." );
}
else if (starsign.equals("Gemeni")) {
	JOptionPane.showMessageDialog(null, "You are cerebral, chatty, loves learning and education, charming, and adventurous.");
}
else if (starsign.equals("Cancer")) {
	JOptionPane.showMessageDialog(null, "You are emotional, group oriented, seeks security, family.");
}
else if (starsign.equals("Leo")) {
	JOptionPane.showMessageDialog(null, "You are generous, organized, protective, beautiful.\n" + " ");
}
else if (starsign.equals("Virgo")) {
	JOptionPane.showMessageDialog(null, "You are particular, logical, practical, sense of duty, critical.\n" + "");
}
else {
	JOptionPane.showMessageDialog(null, "Sorry, what you entered is not included yet.");
}
}
}
	
