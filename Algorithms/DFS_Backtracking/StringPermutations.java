//program to print all permutations of a given string

package DFS_Backtracking;

import java.util.*;

public class StringPermutations {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		StringBuilder s=new StringBuilder(in.next());//new StringBuilder("ABC");
		int start=0;
		int end=s.length()-1;
		generatePermutations(s,start,end);

	}
	
	
	public static void generatePermutations(StringBuilder s, int start, int end)
	{
		if(start==end)
			System.out.print(s+" ");
		else
		{
			for(int i=start;i<=end;i++)
			{
				swap(s,start,i);
				generatePermutations(s,start+1,end);
				swap(s,start,i);
			}
		}
		
	}
	
	public static void swap(StringBuilder s, int l, int r)
	{
		char c=s.charAt(l);
		s.setCharAt(l, s.charAt(r));
		s.setCharAt(r, c);
	}

}
