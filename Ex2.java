/**
 * 
 */
package lab1;

import java.util.Scanner;

/**
 * This is the class to calculate the equation y=4(x-3)+20.
 * The user need to input x (x is integer number).
 * 
 * @author hp
 *
 */
public class Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//get x input
		System.out.print("To calculate the equation y = 4(x-3)+20. Please input the integer value of x: ");
		int x = input.nextInt();
		//Calculate the equation y
		int y = 4 * (x - 3) + 20;
		System.out.println("The result of y is: y = " + y);
	}

}
