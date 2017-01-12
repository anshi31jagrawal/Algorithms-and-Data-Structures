package Miscellaneous;
import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String input=s.nextLine();
		String in_message=s.nextLine();
		String message=in_message.toUpperCase();
		
		String[] mapping = input.split(" ");
		String uncoded="";
		for(int i=0;i<message.length();i++)
		{
			char c=message.charAt(i);
			if(!Character.isAlphabetic(c))
			{
				uncoded+=c;
				continue;
			}
			if(c==' ')
			{
				uncoded+=" ";
				continue;
			}
			for(int j=0;j<mapping.length;j++)
			{
				if(mapping[j].charAt(0)==c)
				{
					if(Character.isUpperCase(in_message.charAt(i)))
						uncoded+=mapping[j].charAt(2);
					else
						uncoded+=Character.toLowerCase(mapping[j].charAt(2));
				}
			}
		}
		
		System.out.println(uncoded);

	}

}
