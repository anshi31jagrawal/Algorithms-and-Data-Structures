package Miscellaneous;
import java.util.*;


public class StringConstruction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        /*int n = in.nextInt();
        ArrayList<String> input = new ArrayList<>();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            input.add(s);
        }
        for(int i=0;i<input.size();i++)
        	System.out.println(noOfSteps(input.get(i)));*/
		System.out.println(FindPalindrome(in.next()));

	}
	
	public static int unique(String s)
	{
		int steps=0;
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<s.length();i++)
			if(!list.contains(s.charAt(i)))
			{
				list.add(s.charAt(i));
				steps++;
			}
		return steps;	
				
	}
	
	  public static int FindPalindrome(String s)
	    {
	            
	            if(isPalindrome(s))
	                return -1;
	            else
	            {
	                return findindex(s);
	            }
	    }
	  public static boolean isPalindrome(String s)
	  {
		  StringBuilder sb = new StringBuilder(s);
          StringBuilder sb_org = new StringBuilder(s);
          StringBuilder sb_rev = new StringBuilder();
          sb_rev = sb.reverse();
          if(sb_rev.toString().equals(sb_org.toString()))
              return true;
          else
        	  return false;
          
	  }

	/**
	 * @param s
	 */
	private static int findindex(String s) {
		int ans=0;
		for(int i=0;i<s.length();i++)
		{
			String sub ="";
			if(i==0)
				sub=s.substring(1);
			else if(i==s.length()-1)
				sub=s.substring(0,s.length()-1);
			else
				sub = s.substring(0, i)+s.substring(i+1);
			if(isPalindrome(sub))
				{
				ans=i;
				break;
				
				}
				
			
		}
		return ans;
	}

	
	public static int noOfSteps(String s)
	{
		String p="";
		int steps=0;
		while(s.length()>0)
		{
			int i=0;
			String append =s.charAt(0)+"";
			String previous="";
			if(!p.contains(append))
			{
				steps++;
				p+=append;
				s=s.substring(1);	
			}
			else
			{
				int endindex=0;
				while(p.contains(append) && i<s.length())
				{
					endindex =i++;
					previous = append;
					append = s.substring(0, i);
					
				}
				p+=append.substring(0,append.length()-1);
				s=s.substring(i);
			}
		}
		return steps;
	}

}
