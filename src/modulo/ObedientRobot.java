package modulo;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot Joe = new Robot ()	;
public static void main(String[] args) {
	String shape = 
	JOptionPane.showInputDialog("Do you want the robot to draw a square, a triangle, or a circle?");
	String color = 
	JOptionPane.showInputDialog(" Do you want red, orange, yellow, green, blue, magenta?");	
	if (color.equals("red")) {
	Joe.setPenColor(Color.red);
	}
	else if (color.equals("orange")) {
	Joe.setPenColor(Color.orange);
	}
	else if (color.equals("yellow")) {
	Joe.setPenColor(Color.yellow);	
	}
	else if (color.equals("green")) {
	Joe.setPenColor(Color.green);
	}
	else if (color.equals("blue")) {
	Joe.setPenColor(Color.blue);	
	}
	else if (color.equals("magenta")) {
	Joe.	setPenColor(Color.magenta);
	}
	if (shape.equals("square")) {
	drawSquare();
	}
	else if (shape.equals("triangle")){
	drawTriangle();
	}
	else if (shape.equals("circle")) {
	drawCircle();
	}
}
static void drawSquare() {
Joe.penDown();
Joe.setSpeed(30);
for (int S = 0; S < 4; S++) {
Joe.move(100);
Joe.turn(90);
}
}
static void drawTriangle() {
Joe.penDown();	
Joe.setSpeed(30);
for (int T = 0; T < 3; T++) {
Joe.move(100);
Joe.turn(120);
}
}
static void drawCircle() {
Joe.penDown();
Joe.setSpeed(30);
for (int C = 0; C < 36; C++) {
Joe.move(10);
Joe.turn(10);
}
}
}