//Pattern: Triangle of numbers
//Send Feedback
//Print the following pattern for the given number of rows.
//Pattern for N = 4
//...1
//..232
//.34543
//4567654
//The dots represent spaces.
package pattern;
import java.util.Scanner;
public class pat1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int currRow = 1;
		
		while(currRow <= n){
			
			int spaces = 1;
			while(spaces <= (n - currRow)) {
				System.out.print(" ");
				spaces += 1;
			}
			
		
			int currCol = 1;
			int valToPrint = currRow;
			while(currCol <= currRow) {
				System.out.print(valToPrint);
				valToPrint += 1;
				currCol += 1;
			}	
			
			currCol = 1;
			valToPrint = 2 * currRow - 2;
			
			while(currCol <= currRow - 1) {
				System.out.print(valToPrint);
				valToPrint -= 1;
				currCol += 1;
			}
			
			System.out.println();
			currRow += 1;
			scan.close();
		}
	}
}
