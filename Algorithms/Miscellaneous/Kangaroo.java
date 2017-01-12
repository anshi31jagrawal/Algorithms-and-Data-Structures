package Miscellaneous;
import java.util.*;

public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        ArrayList<myChar> list_a = new ArrayList<myChar>();
        ArrayList<myChar> list_b = new ArrayList<myChar>();
        char[] arr_a= a.toCharArray();
        char[] arr_b= b.toCharArray();
        
        list_a=formList(arr_a);
        list_b=formList(arr_b);
        
        int ans=0;
        for(int i=0;i<list_a.size();i++)
        {
        	int count=0;
        	boolean found=false;
        	char c=list_a.get(i).getchar();
        	for(int j=0;j<list_b.size();j++)
        	{
        		if(list_b.get(j).getchar()==c)
        		{
        			count = Math.abs(list_a.get(i).getcount()-list_b.get(j).getcount());
        			found=true;
        		}
        		else
        			if(list_b.get(j).getchar()>c && found==false)
        			{
        				count=list_a.get(i).getcount();
        				break;
        			}
        	}
        	ans+=count;
        	
        }
        for(int i=0;i<list_b.size();i++)
        {
        	int count=0;
        	char c=list_b.get(i).getchar();
        	for(int j=0;j<list_a.size();j++)
        	{
        		if(list_a.get(j).getchar()==c)
        			continue;
        		else
        			if(list_b.get(j).getchar()>c)
        				break;
        	}
        	ans+=count;
        	
        }
    }
	
	public static ArrayList<myChar> formList(char[] arr){
		int cnt=0;
		ArrayList<myChar> list=new ArrayList<myChar>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
        {
        	if(arr[i]!=arr[i+1]){
        		cnt++;
        		myChar charNode = new myChar();
        		charNode.c=arr[i];
        		charNode.count=cnt;
        		list.add(charNode);
        		cnt=0;
        		if(i+1==arr.length-1)
        		{
        			myChar charN = new myChar();
            		charN.c=arr[i+1];
            		charN.count=1;
            		list.add(charN);
        		}
        	}
        	else
        	{
        		cnt++;
        		if(i+1==arr.length-1)
        		{
        			myChar charN = new myChar();
            		charN.c=arr[i];
            		charN.count=2;
            		list.add(charN);
        		}
        	}
        		
        }
		return list;
	}
	
	public static class myChar{
		char c;
		int count;
		
		char getchar(){
			return c;
		}
		
		int getcount(){
			return count;
		}
	}
	
	

}
