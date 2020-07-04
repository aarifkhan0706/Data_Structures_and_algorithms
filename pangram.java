package strings;

/*A word or a sentence is called a pangram if all
the characters of this language appear in it at least once.
You are given a string s consisting of lowercase
and uppercase Latin letters. Check whether this 
string is a pangram. Print "YES" or "NO".
We say that the string contains a letter of the 
Latin alphabet, if this 
letter occurs in the string in either 
uppercase or in lowercase
Sample Input 1 :
12
toosmallword
Sample Output 1 :
NO
Sample Input 2 :
35
TheQuickBrownFoxJumpsOverTheLazyDo
Sample Output 2 :
YES*/

import java.util.HashMap;
public class pangram {
	public static void main(String[] args) {
		int n = 35;
		String str = "TheQuickBrownFoxJumpsOverTheLazyDogg";
		panag(n,str);
	}
	public static void panag(int n,String str){
		int flag=0;
		if(n<26)//as all the alphabets equals to 26
		{
			System.out.println("NO");
		}
		else {
			HashMap<Character,Integer> seen = new HashMap<>();
			for(int i=0; i<str.length(); i++)
			{
				if(seen.containsKey(Character.toLowerCase(str.charAt(i)))) {
					continue;
				}
				else {
					flag++;
					seen.put(Character.toLowerCase(str.charAt(i)),1);
				}
				
			}
			System.out.println("total alphabet is :"+flag);
			if(flag>=26)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
