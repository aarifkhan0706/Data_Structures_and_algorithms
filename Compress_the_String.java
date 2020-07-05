/*
 * Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
For e.g. if a String has 'x' repeated 5 times, replace this "xxxxx" with "x5".
Sample Input 1 :
aaabbccdsa
Sample Output 1 :
a3b2c2dsa
 */
package strings;
import java.util.HashMap;
public class Compress_the_String {
	public static String compress(String inputString) {
		// Write your code here
        String str = "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<inputString.length(); i++)
        {
            if(map.containsKey(inputString.charAt(i)))
            {
                map.put(inputString.charAt(i),map.get(inputString.charAt(i))+1);
                if(i==inputString.length()-1)// FOR THE LAST ELEMENT IF ITS MORE THAN ONE
                {
                 	str+=Character.toString(inputString.charAt(i));
                    if(map.get(inputString.charAt(i))>1){
                        str+=String.valueOf(map.get(inputString.charAt(i)));
                    }   
                }
            }
            else
            {
             	if(i>0)// NOT STARTING FOR THE FIRST ELEMENT
                {
                    str+=Character.toString(inputString.charAt(i-1));
                    if(map.get(inputString.charAt(i-1))>1){// IF NUMBER IS REPEATED MORE THAN ONE
                        str+=String.valueOf(map.get(inputString.charAt(i-1)));
                    }
                    
                }
                map.clear();
                map.put(inputString.charAt(i),1);
                if(i==inputString.length()-1)// FOR THE LAST ELEMENT IF ITS ONLY ONE
                {
                 	str+=Character.toString(inputString.charAt(i));
                    if(map.get(inputString.charAt(i))>1){
                        str+=String.valueOf(map.get(inputString.charAt(i)));
                    }   
                }
            }
        }
        return str;

	}
	public static void main(String[] args)
	{
		System.out.println(compress("aaabbcddeeeee"));
	}


}
