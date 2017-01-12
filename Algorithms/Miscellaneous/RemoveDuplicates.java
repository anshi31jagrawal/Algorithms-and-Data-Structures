package Miscellaneous;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.next();
		char[] arr=s.toCharArray();
		//String noDup=removeDuplicates(arr);
		String noDup=myRemoveDuplicates(arr);
		System.out.print(noDup);
	}
	public static String removeDuplicates(char[] s)
	{
		int n=s.length;
		int i=0;
		String ans=new String();
		//ans.append(s[0]);
		for(;i<n;i++)
			for(int j=i+1;j<n;)
		{
				if(s[i]==s[j])
				{
					s[j]=s[--n];
				}
				else
					j++;
				
				//ans.append(s[j]);
		}
		s[i]='\0';
		 //toString().substring(0,i);
		for(int k=0;k<n && s[k]!='\0';k++)
		{
			ans+=s[k];
		}
		return ans;
	}
	
	public static String myRemoveDuplicates(char[] s)
	{
		int i=1;
		int j=0;
		int n=s.length;
		String ans=s[0]+"";
		for(;i<n;i++)
		{
			if(s[i]!=s[i-1])
			{
				s[j+1]=s[i];
				ans+=s[j+1];
				j++;
				
			}
		}
		System.out.println("Length:"+(j+1));
		return ans;
	}

}
