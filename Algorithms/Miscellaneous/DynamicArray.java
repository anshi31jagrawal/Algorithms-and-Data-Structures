package Miscellaneous;
import java.util.*;
public class DynamicArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n_tcs=in.nextInt();
        for(int i=0;i<n_tcs;i++)
        {
        	int n=in.nextInt();
        	int[] arr=new int[n];
        	for(int j=0;j<n;j++)
        		arr[j]=in.nextInt();
        	String ans=TrySort(n,arr);	
        	System.out.println(ans);
        }
    }
	
	public static String TrySort(int n, int[] arr)
	{
		String ans="";
		boolean unsorted = false;
		if(arr.length<3)
			if(isSorted(arr))
				return "Yes";
			else	
				return "No";
		else
		{
		
		check: for(int i=0;i<n-1;i++){
			if(i==(n-2) && arr[i+1]==arr[i]+1)
				return "Yes";
			if(arr[i+1]!=arr[i]+1)
			{
				if((i+3)>(n))
					return "No";
				else
				{
					int[] sub_arr=new int[]{arr[i],arr[i+1],arr[i+2]};
					int[] sub_sort_done=sort_sub_arr(sub_arr);
					if(sub_sort_done.length==3)
					{
						arr[i]=sub_sort_done[0];
						arr[i+1]=sub_sort_done[1];
						arr[i+2]=sub_sort_done[2];
						i=-1;
						continue;
					}
					else
						return "No";
						
				}
					
			}	
			
		}
		
		
		return ans;
		}
	}
	
	public static int[] sort_sub_arr(int[] sub_arr){
		
		if(isSorted(sub_arr))
		{
			return sub_arr;
		}
		for(int i=0;i<2;i++)
		{
			int temp=sub_arr[0];
			sub_arr[0]=sub_arr[1];
			sub_arr[1]=sub_arr[2];
			sub_arr[2]=temp;
			if(isSorted(sub_arr))
				return sub_arr;
		}
		
		int[] sorted=new int[1];
		return sorted;
		
	}
	public static boolean isSorted(int[] arr){
		for(int i=0;i<arr.length-1;i++)
			if(arr[i+1]!=arr[i]+1)
				return false;
		return true;
		
	}
}
