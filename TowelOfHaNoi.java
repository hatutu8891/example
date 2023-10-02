/**
 * 
 */
package lab2;

/**
 * @author hp
 *
 */
public class TowelOfHaNoi {
	int disk;
	char source;
	char dest;
	char spare;

	/**
	 * @param disk
	 * @param source
	 * @param dest
	 * @param spare
	 */
	public TowelOfHaNoi(int disk, char source, char dest, char spare) {
		super();
		this.disk = disk;
		this.source = source;
		this.dest = dest;
		this.spare = spare;
	}

	public static void moveTowel(int disk, char source, char dest, char spare) {
		if (disk == 1) {
			System.out.println("There are no disk to move");
		} else {
			moveTowel(disk - 1, source, dest, spare);
			System.out.println("Move disk from" + source + "to" + dest);
			moveTowel(disk - 1, source, dest, spare);
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
