package Strings;

import java.util.*;
import java.util.Map.Entry;

public class DNASequences {

	public static void main(String[] args) {
		String s="AAAAAAAAAAA";
		findRepeatedDnaSequences(s);
		
	}

	public static List<String> findRepeatedDnaSequences(String s) {
        List<String> ans=new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<s.length()-10+1;i++)
        {
        	String sub=s.substring(i, i+10);
        	if(map.containsKey(sub))
        	{
        		ans.add(sub);
        		System.out.println(sub);
        		map.put(sub,map.get(sub)+1);
        	}
        	else
        		map.put(sub, 1);
        }
        return ans;
    }
}
