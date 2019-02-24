//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Bob = new Robot ();
		Bob.setSpeed(10);
		Bob.penDown();
		//3. Ask the user what color they would like the robot to draw
		for (int j = 0; j < 5; j++) {
		String color =  
		JOptionPane.showInputDialog("would you like the robot to draw red or pink?");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equals("red")){
	Bob.setPenColor(Color.red);

}
else if(color.equals("pink")) {
	Bob.setPenColor(Color.pink);
}
        //6. If the user doesn’t enter anything, choose a random color
else{
Bob.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		Bob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
for (int i = 0; i < 4; i++) {
Bob.move(100);
Bob.turn(90);
}
	}
}
}
