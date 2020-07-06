//Alphabet/ Character Patterns in Java
// 
//
//1. Right Alphabetic triangle 
//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
//A B C D E F
package pattern;
import java.util.Scanner;
public class pat2 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int alphabet = 65;
		for(int i=0; i<n; i++) // for row's
		{
			for(int j =0; j<=i; j++) //for column's
			{
				System.out.print((char)(alphabet+j));
			}
			System.out.println();
		}
		scan.close();
	}
}
