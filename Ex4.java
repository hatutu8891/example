/**
 * 
 */
package lab1;

import java.util.Scanner;

/**This is the class to calculate the perimeter and the area of the circle.
 * The user must input a radius of the circle.
 * 
 * @author hp
 *
 */
public class Ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//get radius input
		System.out.print("Input a radius of the circle: ");
		double radius = input.nextDouble();
		//calculate the perimeter 
		double perimeter = 2 * radius * Math.PI;
		System.out.println("The perimeter of the circle with radius " + radius + " is: " + perimeter);
		//calculate the area
		double area = radius * radius * Math.PI;
		System.out.println("The area of the circle with radius " + radius + " is: " + area);
	}
}
