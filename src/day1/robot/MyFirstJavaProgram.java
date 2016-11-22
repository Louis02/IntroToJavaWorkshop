package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot cc = new Robot();
cc.hide();
cc.setPenWidth(10);
cc.setPenColor(Color.GREEN);
cc.setSpeed(3);
cc.sparkle();
cc.penDown();
for(int i = 0; i < 4; i++){
	cc.move(250);
	cc.turn(90);
}

		
		
	}
}
