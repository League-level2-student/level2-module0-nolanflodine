package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
	//2. create an array of 5 robots.
Robot [] robot= new Robot[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < robot.length; i++) {
robot[i]=new Robot();
System.out.println(i);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
robot[0].setY(500);
robot[0].setX(100);
robot[1].setY(500);
robot[1].setX(200);
robot[2].setY(500);
robot[2].setX(300);
robot[3].setY(500);
robot[3].setX(400);
robot[4].setY(500);
robot[4].setX(500);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
for (int j = 0; j < 99; j++) {		
for (int i = 0; i < robot.length; i++) {
	if (robot[i].getY()>=0) {
	robot[i].setSpeed(10);
	Random r = new Random();
	int rand=r.nextInt(50);
	robot[i].move(rand);
	}
	else {
		j=99;
		robot[i].turn(1440);
		break;
	}
}
}
}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}

