package Strings;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map.Entry;

public class GeneralStrings {

	public static void main(String[] args) {
		//////////////////To print first non-repeating letter
		String s="abzbbzaxa";
		Hashtable<Character, Integer> h=new Hashtable<>();
		for(int i=0;i<s.length();i++)
		{
			if(h.containsKey(s.charAt(i)))
			{
				h.put(s.charAt(i), h.get(s.charAt(i))+1);
			}
			h.putIfAbsent(s.charAt(i),1);
		}
		for(Character c: h.keySet())
		{
			if(h.get(c)!=1)
				System.out.print(c);
		}
		
		//////////////////To print first repeating letter
		//String s="abzbbzaxa";
		//Hashtable<Character, Integer> h=new Hashtable<>();
		for(int i=0;i<s.length();i++)
		{
			if(h.containsKey(s.charAt(i)))
			{
				System.out.print(s.charAt(i));
				break;
			}
			h.putIfAbsent(s.charAt(i),1);
		}
		////////////////////////////////To print pairs of integers whose sum is s. 
		int[] arr={2,4,7,1,4,6,8,2,3,5,0};
		Hashtable<Integer, Integer> h1=new Hashtable<>();
		int sum=5;
		for(int i=0;i<arr.length;i++)
		{
			if(h.containsKey(sum-(arr[i])))
			{
				System.out.println("{"+arr[i]+","+(sum-(arr[i]))+"}");
			}
			h1.putIfAbsent(arr[i],(sum-arr[i]));
			
		}
	}

}

