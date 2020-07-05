/*
 * Given a string S, remove consecutive duplicates from it recursively.
 * Sample Input 1 :
	aabccba
	Sample Output 1 :
	abcba
	Sample Input 2 :
	xxxyyyzwwzzz
	Sample Output 2 :
	xyzwz
*/
package strings;
import java.util.HashMap;
public class Remove_Consecutive_Duplicates {
	public static void main(String[] args)
	{
		String s ="aabccba";
		System.out.println(removeConsecutiveDuplicates(s));
	}
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        String str = "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                continue;
            }
            else
            {
                str+=(Character.toString(s.charAt(i)));
                map.clear();
                map.put(s.charAt(i),1);
            }
        }
        return str;

	}
}
