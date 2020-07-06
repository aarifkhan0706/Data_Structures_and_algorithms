//55555
//45555
//34555
//23455
//12345
package pattern;
import java.util.Scanner;
public class pat4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 5; i >= 1; i--) 
		{  
			for (int j = i; j <= n; j++)//using the ith value to print numbers accordingly
			{
		       System.out.print(j+" ");
			}
		    
			for (int k = i; k>1; k--)
			{
				System.out.print(n+" ");
			}
		    System.out.println();
		}
		scan.close();
		
	}

}
