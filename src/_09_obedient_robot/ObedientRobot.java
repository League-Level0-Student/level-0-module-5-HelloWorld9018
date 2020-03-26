package _09_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
static Robot bob = new Robot();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bob.miniaturize();
		bob.setSpeed(20);
		bob.setPenWidth(5);
		bob.penDown();
		String Response = JOptionPane.showInputDialog(null, "What shape do you want Bob to draw: square, circle, or triangle?");
		String color = JOptionPane.showInputDialog(null, "What color do you want: blue, cyan, green, orange, magenta, or pink?");
				
		if(color .equalsIgnoreCase("blue")) { bob.setPenColor(Color.BLUE); }
		if(color .equalsIgnoreCase("cyan")) { bob.setPenColor(Color.CYAN ); }
		if(color .equalsIgnoreCase("green")) { bob.setPenColor(Color.GREEN ); }
		if(color .equalsIgnoreCase("orange")) { bob.setPenColor(Color.ORANGE ); }
		if(color .equalsIgnoreCase("magenta")) { bob.setPenColor(Color.MAGENTA ); }
		if(color .equalsIgnoreCase("pink")) { bob.setPenColor(Color.PINK ); }
		
		
		if (Response .equalsIgnoreCase("square")) {
	
		    drawSquare();
		}
		
		if (Response .equalsIgnoreCase("Triangle")) {
			
			drawTriangle();
		}
		
		if (Response .equalsIgnoreCase("Circle")) {
			
			drawCircle();	
		}
	
	}
	
static void drawSquare() {

	for(int i = 0; i<4; i++) {
	bob.move(60);
	bob.turn(90);
	}
}

static void drawTriangle() {

	for(int i = 0; i < 3; i ++) {
		bob.turn(-120);
		bob.move(60);
	}
}

static void drawCircle() {

	bob.setSpeed(100);
	for(int i = 0; i <70; i++) {
		bob.move(3);
		bob.turn(5);
	}
}


}
