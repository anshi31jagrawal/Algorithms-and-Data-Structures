package Miscellaneous;
import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int tn = in.nextInt();
        for(int k=0;k<tn;k++)
        {
        	String s = in.next();
        	System.out.println(findIndex(s));
        }

	}
	public static int findIndex(String s)
	{
		int i=0;
		int j=s.length()-1;
		boolean isPalindrome=true;
		int index=0;
		while(i<=j && i<s.length())
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				isPalindrome=false;
				break;
			}
			else
			{
				i++;
				j--;
			}
		}
		if(!isPalindrome)
		{
			String a =s.substring(0,i)+s.substring(i+1);
			String b =s.substring(0,j)+s.substring(j+1);
			if(isPal(a))
				index=i;
			else
				index=j;
			return index;
		}
		return -1;
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
