package Miscellaneous;
import java.util.Scanner;

public class ChangeToPalindrome {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	        int tn = in.nextInt();
	        for(int k=0;k<tn;k++)
	        {
	        	String s = in.next();
	        	System.out.println(findMinCount(s));
	        }

		}
		public static int findMinCount(String s)
		{
			int i=0;
			int j=s.length()-1;
			int diff=0;
			while(i<=j && i<s.length())
			{
				if(s.charAt(i)!=s.charAt(j))
				{
					char a=s.charAt(i);
					char b=s.charAt(j);
					char bigChar = (a>b?a:b);
					char smallChar = (bigChar==a?b:a);
					diff+= bigChar-smallChar;
					if(s.charAt(i)==bigChar)
						s=s.substring(0,i)+smallChar+s.substring(i+1);
					else
						s=s.substring(0,j)+smallChar+s.substring(j+1);
				}
				else
				{
					i++;
					j--;
				}
			}
			return diff;
		}
		
		public static boolean isPal(String st)
		{
			StringBuilder stb = new StringBuilder();
			StringBuilder stbCopy = new StringBuilder();
			stbCopy.append(st);
			stb.append(st);
			stb.reverse();
			for(int i=0;i<stb.length();i++)
			{
				if(stb.charAt(i)!=stbCopy.charAt(i))
					return false;
			}
			return true;
		}

}
