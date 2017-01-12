package Strings;

import java.util.*;

public class LongestKCharSubstring {

	public static void main(String[] args) {
		String s="abcababb";
		int k=3;
		System.out.println(longestSubstring(s, k));

	}
public static int longestSubstring(String s, int k) {
        if(s==null || s.length()==0)
        	return 0;
        int len=0;
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
        	char c=s.charAt(i);
        	if(map.containsKey(c))
        		map.put(c,map.get(c)+1);
        	else
        		map.put(c,1);
        }
        int start=0;
        ArrayList<String> ans=new ArrayList<String>();
        for(int i=0;i<s.length();i++)
        {
        	char c=s.charAt(i);
        	if(map.get(c)<k)
        	{
        		String sub=s.substring(start,i);
        		ans.add(sub);
        		start=i+1;
        	}
        	else if(i==s.length()-1)
        	{
        		String sub=s.substring(start);
        		ans.add(sub);
        	}
        }
        
        Comparator<String> comp=new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				Integer l1=o1.length();
				Integer l2=o2.length();
				return l2.compareTo(l1);
			}
		};
        
        ans.sort(comp);
        return ans.get(0).length();
        
    }

}
