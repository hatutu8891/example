/**
 * 
 */
package lab2;

/**
 * @author hp
 *
 */
public class TowelOfHaNoi {

	public static void moveTowel(int disk, char source, char dest, char spare) {
		if (disk == 1) {
			System.out.println("Move disk 1 from " + source + " to " + dest);
			return;
		} else {
			moveTowel(disk - 1, source, spare, dest);
			System.out.println("Move disk " + disk + " from " + source + " to " + dest);
			moveTowel(disk - 1, spare, dest, source);
		}
	}

	public static void main(String[] args) {
		int disk = 3;
		char source = 'A';
		char dest = 'C';
		char spare = 'B';
		moveTowel(disk, source, dest, spare);
	}

}
