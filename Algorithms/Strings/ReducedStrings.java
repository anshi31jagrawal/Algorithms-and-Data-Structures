package Strings;

import java.util.Scanner;

public class ReducedStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
       	System.out.println(reducedString(s));
     
	}

	public static String reducedString(String s)
	{
		for(int i=0;i<s.length()-1;)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				String rs=s.substring(0,i);
				if(i+2<s.length())
					rs+=s.substring(i+2);
				s=rs;
				if(i>0)
					i--;
			}
			else
				i++;
		}
		if(s.length()==0)
			return "Empty String";
		return s;
	}
}
