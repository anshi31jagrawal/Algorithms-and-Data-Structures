package Strings;

import java.util.*;
import java.util.Map.Entry;

public class FrequencySort {

	public static void main(String[] args) {
		String s="tree";
		System.out.println(frequencySort(s));

	}
	
	public static String frequencySort(String s) {
        StringBuilder ans=new StringBuilder();
        LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
        for(int i=0;i<s.length();i++)
        {
        	Character c=s.charAt(i);
        	if(map.containsKey(c))
        	{
        		map.put(c, map.get(c)+1);
        	}
        	else
        		map.put(c, 1);
        }
        Comparator<Map.Entry<Character, Integer>> comp= new Comparator<Map.Entry<Character,Integer>>() {
			
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				Integer n1=o1.getValue();
				Integer n2=o2.getValue();
				return n2.compareTo(n1);
			}
		};
		List<Map.Entry<Character, Integer>> mapList=new ArrayList<>(map.entrySet());
		Collections.sort(mapList, comp);
		for(int i=0;i<mapList.size();i++)
		{
			Entry pair=mapList.get(i);
			Character c=(Character) pair.getKey();
			int freq=(int) pair.getValue();
			for(int j=0;j<freq;j++)
				ans.append(c);
			
		}
		return ans.toString();
    }

}
