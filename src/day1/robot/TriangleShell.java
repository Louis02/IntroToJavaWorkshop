package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot cc = new Robot("batman");

	void go() {
		cc.penDown();

		// 6. Make the robot go as fast as possible
		cc.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int trileng = 50;
		// 7. Do the following (up to step 10) 60 times
		for (int i = 0; i < 60; i++) {
			// 9. Change the color of the pen to a random color

			// 8. Increase the length of the side by 10 pixels
			trileng = trileng + 13;
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(trileng);
			// 10. Turn the tortoise 6 degrees to the right
			cc.turn(10);
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		for (int i = 0; i < 5; i++) {
			cc.move(length);
			cc.turn(360 / 5);
		}
	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
