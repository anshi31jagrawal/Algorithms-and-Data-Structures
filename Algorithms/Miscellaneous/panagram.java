package Miscellaneous;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toLowerCase();
        ArrayList<Character> list = new ArrayList<Character>();
        int n=0;
        for(int i=0;i<s.length();i++)
        {
            Character a=s.charAt(i);
            if(Character.isAlphabetic(a))
                if(!list.contains(a))
                    n++;
            
        }
        if(n==26)
            System.out.println("panagram");
        else
            System.out.println("not panagram");*/
		/*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        boolean beautiful=false;
        int no=0;
        if(!B.contains("010"))
        {
            System.out.println(0);
            return;
        }
        else
        {
            while(beautiful != true)
            {
                while(B.contains("01010"))
                {
                    B=B.replaceFirst("01010","01110");
                    no++;
                }
                while(B.contains("010"))
                {
                    B=B.replaceFirst("010","000");
                    no++;
                }
                if(!B.contains("010"))
                    beautiful = true;
            }
        }
        System.out.println(no);*/
		
		/*Scanner in = new Scanner(System.in);
        int tn = in.nextInt();
        int[] arr = new int[tn];
        for(int k=0;k<tn;k++)
        {
        String s = in.next();
        
        
        int n=0;
        char c;
        char p;
        if(isGood(s))
        {
        	arr[k]=0;
        	continue;
        }    
        else
        {
        	c=s.charAt(1);
        	p=s.charAt(0);
        	int i=1;
        	
        	while(!isGood(s))
        	{
        		c=s.charAt(i);
        		p=s.charAt(i-1);
        		if(c==p)
        		{
        			s=s.substring(0, i-1)+s.substring(i);
        			n++;
        		}
        		else
        		i++;
        	}
        }
        arr[k]=n;
        }
        for(int j=0;j<arr.length;j++)
            System.out.println(arr[j]);
            */
		/*Scanner in = new Scanner(System.in);
        String s = in.next();
        String ans=s.charAt(0)+"";
        char c;
        char p;
        for(int i=1;i<s.length();i++)
        {
            c=s.charAt(i);
            p=s.charAt(i-1);
            if(c!=p)
                ans+=c;
        }
        System.out.print(ans);*/
        
			/*Scanner in = new Scanner(System.in);
	        int tn = in.nextInt();
	        ArrayList<String> arr = new ArrayList<String>();
	        for(int i=0;i<tn;i++)
	        	arr.add(in.next());
	        String ans="";
        HashSet<Character> one = new HashSet<>();
    	for(int j=0;j<arr.get(0).length();j++)
    		one.add(arr.get(0).charAt(j));
    	
        for(int i=1;i<arr.size();i++)
        {
        	HashSet<Character> two = new HashSet<>();
        	for(int j=0;j<arr.get(i).length();j++)
        		two.add(arr.get(i).charAt(j));
        	one.retainAll(two);
        	
        }
        System.out.println(one.size());*/
		
		/*Scanner in = new Scanner(System.in);
        int tn = in.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0;i<tn;i++)
        	arr.add(in.next());
        String ans="";
        for(int i=0;i<tn;i++)
        {
            StringBuilder s = new StringBuilder();
            s.append(arr.get(i));
            StringBuilder rev = new StringBuilder();
            rev.append(arr.get(i));
            StringBuilder newrev = new StringBuilder();
            newrev.append(rev.reverse());
            boolean isFunny=true;
            for(int j=1;j<s.length();j++)
            {
                if(!(Math.abs(s.charAt(j)-s.charAt(j-1)) == Math.abs(rev.charAt(j)-rev.charAt(j-1))))
                {
                    isFunny = false;
                    break;
                }
            }
            if(isFunny == true)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");
            
        }*/
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        int start=0;
        int end=n-1;
        HashMap<Integer, Integer> arr = new HashMap<Integer,Integer>();
        /*while(start<n/2)
        {
            if(number.charAt(start) != number.charAt(end))
            {
                int repl = 0;
                int replIndex = 0;
                if((Integer.parseInt(number.charAt(start)+""))> (Integer.parseInt(number.charAt(end)+"")))  
                {
                	repl=(Integer.parseInt(number.charAt(start)+""));
                	replIndex = start;
                }
                else
                {
                	repl=(Integer.parseInt(number.charAt(end)+""));
                	replIndex = end;
                }
                char[] arr1 = number.toCharArray();
                arr1[replIndex] = (char) repl;
                number = arr1.toString();
            }
            start++;
            end--;
        }*/
        System.out.println(number);
    }
	
	public static boolean isGood(String s)
    {
        char c;
        char p;
        for(int i=1;i<s.length();i++)
        {
            c=s.charAt(i);
            p=s.charAt(i-1);
            if(c==p)
                return false;
            
        }
        return true;
    }

}
