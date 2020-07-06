package pattern;
/*
 * Sample Input :
	5
	Sample Output :
	1
	23 
	4567
	89123456
	7891234567891234
 */

public class pat5 {
	public static void print(int n) {
		//Write your code here
        int num = 1;
        int ans = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=num ; j++){
                System.out.print(ans);
                if(ans==9){
                	ans=1;
            	}
            	else{
                	ans=ans+1;
            	}
            }
            System.out.println();
            num*=2;
        }
	}
	public static void main(String[] args)
	{
		int n = 5;
		print(n);
	}
}
