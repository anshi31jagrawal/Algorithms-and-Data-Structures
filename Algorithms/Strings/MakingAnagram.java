package Strings;

import java.util.Scanner;

public class MakingAnagram {

	static int[] arr= new int[26];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int sum=0;
        for(int i=0;i<Math.max(s1.length(),s2.length());i++)
        {
        	if(i<s1.length())
        		arr[s1.charAt(i)-'a']++;
        	if(i<s2.length())
        		arr[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        	sum+=Math.abs(arr[i]);
        System.out.println(sum);

	}

}
