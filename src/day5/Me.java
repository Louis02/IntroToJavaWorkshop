package day5;

import org.jointheleague.graphical.robot.Robot;

public class Me {
	public static void main(String[] args) {

		Robot cc = new Robot("batman");
		cc.setSpeed(10);
		cc.moveTo(250, 100);
		cc.turn(180);
		cc.penDown();
		cc.move(600);
		cc.turn(-90);
		cc.move(300);
		cc.penUp();
		cc.move(200);
		cc.penDown();
		cc.turn(-90);
		cc.move(600);
		cc.turn(90);
		cc.move(215);
		cc.turn(45);
		cc.move(200);
		cc.turn(45);
		cc.move((int) (600-2*Math.sqrt(200*200/2)));
		cc.turn(45);
		cc.move(200);
		cc.turn(45);
		cc.move(200);
	}
}
