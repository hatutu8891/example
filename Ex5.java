/**
 * 
 */
package lab1;

import java.util.Scanner;

/**
 * This is the class to change the total number of seconds, convert to hours, minutes, and seconds and print it as h:m:s.
 * @author hp
 *
 */
public class Ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//get the total number of seconds
		System.out.print("Input the total number of seconds: ");
		int second = input.nextInt();
		//convert to hours
		int hours = second / 3600;
		//convert to minutes
		int minutes = second % 3600 / 60;
		//convert to seconds
		int seconds = second % 3600 % 60;
		System.out.println(second + " seconds => " + hours + ":" + minutes + ":" + seconds);
	}
}
