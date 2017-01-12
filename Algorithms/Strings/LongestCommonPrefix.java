package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strings={"abc", "abc","abc","abc","abc"};
		System.out.println(longestCommonPrefix(strings));
	}

	public static String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
        	return "";
		String sub="";
        Arrays.sort(strs);
        if(strs[0].length()==0)
        	return "";
        for(int i=0;i<strs[0].length();i++)
        {
        	sub=strs[0].substring(0,i+1);
        	for(int j=1;j<strs.length;j++)
        	{
        		if(!strs[j].substring(0, i+1).equals(sub))
        		{
        			return strs[0].substring(0, i);
        		}
        		
        	}
        }
        return sub;
    }
}
