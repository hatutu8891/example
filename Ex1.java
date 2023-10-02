/**
 * 
 */
package lab1;

import java.util.Scanner;

/**
 * This is the class to calculate product of multiplying 2 values input, one integer number and one floating-point number
 * @author hp
 *
 */
public class Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input one integer and one floating-point number");
		//get x input
		System.out.print("Input one integer number: ");
		int x = input.nextInt();
		//get y input
		System.out.print("Input one floating-point number: ");
		double y = input.nextDouble();
		//calculate product of multiplying 2 values input
		System.out.println("Input values are " + x + " and " + y + " their product is " + x * y);
	}
}
