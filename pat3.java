//Repeat Triangle
//Level MEDIUM
//Print the following pattern for the given number of rows.
//Pattern for N = 3
//ABCCBA
// ABBA
//  AA
package pattern;
import java.util.Scanner;
public class pat3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int h = n;//this is used to not mess with rows as initially only two rows were
		//printing because of using n
		int alphabet = 65;//for printing characters
		for(int i=0; i<n; i++)//for row's
		{
			for(int k=0; k<i; k++ )//for front space's
			{
				System.out.print(" ");
			}
			
			for(int j=0; j<h; j++)//for first n column's
			{
				System.out.print((char)(alphabet+j));
			}
			
			for(int m=h-1; m>=0; m--)//for last n column's
			{
				System.out.print((char)(alphabet+m));
			}
			//we dnt need back space loop 
//			for(int l=0; l<i; l++)//for back space's 
//			{
//				System.out.print(" ");
//			}
			System.out.println();
			h--;//decreasing value of h so that next time one less character gets printed
			//in each loop
			
			
		}
		scan.close();
	}
}
