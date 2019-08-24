/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {

        double time;
        double distance;
        double speed;
        double gravity = 9.8;
        Scanner s = new Scanner(System.in);
        time = s.nextDouble();
        speed = gravity * time;
        distance = 0.5 * gravity * (time * time);
        System.out.printf(" The speed of the object at " + time + " seconds after its release is" + speed + " and the distance the object has travelled in the" + time + " seconds after the relase is" + distance);




		/* TODO 2:
         *   a.
         *   b.
         *   c.
		 * */
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
