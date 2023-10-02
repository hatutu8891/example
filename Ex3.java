/**
 * 
 */
package lab1;

import java.util.Scanner;

/**
 * This is the class to change mile to kilometer(km).
 * The user must input mile want to change.
 * @author hp
 *
 */
public class Ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//get mile input
		System.out.print("Input a mile: ");
		double mile = input.nextDouble();
		double km = mile * 1609;
		System.out.println(mile + " miles = " + km + " km");
	}
}
