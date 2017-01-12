package Strings;

import java.util.*;
import java.util.Map.Entry;

public class AnagramicPalindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
       	System.out.println(CanBePalindrome(s));     
	}
	
	public static String CanBePalindrome(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		int oddcount=0;
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext())
		{
			Entry<Character,Integer> pair = (Entry<Character,Integer>)iter.next();
			int val = pair.getValue();
			if(val%2!=0)
				oddcount++;
		}
		if(oddcount>1)
			return "NO";
		else
			return "YES";
	}

}
