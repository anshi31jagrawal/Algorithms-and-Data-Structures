import java.util.ArrayList;

public class LongestIncreasingSubsequence {

	static int[] L;
	public static void main(String[] args) {
		int[] arr=/*{ 10, 22, 9, 33, 21, 50, 41, 60, 80 };*//*{15, 27, 14, 38, 26, 55, 46, 65, 85};*/{5,6,2,3,4,1,9,9,8,9,5};
		if(arr.length==0)
			System.out.print(0);
		if(arr.length==1)
			System.out.print(arr[0]);
		int answer=longestIncSubsequence(arr);
		System.out.print(answer);
		
	}
	
	static int longestIncSubsequence(int[] arr)
	{
		L=new int[arr.length+1];
		for(int i=0;i<L.length;i++)
			L[i]=1; //because for each i we consider the ith element to be included in the list.
		for(int i=0;i<arr.length;i++)
		{	
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i] && L[i]<L[j]+1)
					L[i]=L[j]+1;
			}
		}
		int maxLen = 0;
		for(int i=0;i<L.length;i++)
		{
			if(maxLen<L[i])
				maxLen = L[i];
		}
		return maxLen;
	}

	
	
	/*static int longestIncSubsequence(int[] arr)
	{
		
		int[] LIStable=new int[arr.length];
		int i,j,max=0;
		for(i=0;i<LIStable.length;i++)
			LIStable[i]=1;
		for(i=0;i<arr.length;i++)
			for(j=0;j<i;j++)
			{
				if(arr[i]>arr[j] && LIStable[i]<LIStable[j]+1) 
				{
					LIStable[i]=LIStable[j]+1;
				}
			}
		for(i=0;i<arr.length;i++)
			if(max<LIStable[i])
				max=LIStable[i];
		return max;
	}
*/
}
