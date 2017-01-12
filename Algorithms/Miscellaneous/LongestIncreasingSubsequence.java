package Miscellaneous;
import java.util.ArrayList;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] arr=/*{15, 27, 14, 38, 26, 55, 46, 65, 85};*/{5,6,2,3,4,1,9,9,8,9,5};
		if(arr.length==0)
			System.out.print(0);
		if(arr.length==1)
			System.out.print(arr[0]);
		//int answer=longestIncSubsequence(arr);
		//System.out.print(answer);
		//LongestIncreasingContiguousSubsequence();
		//LINoTwoConsequentSubsequence();
		//LINoThreeConsequentSubsequence();
		//CatalanNumber(3);
		/*int n=3;
		int[] Table = new int[n];
		for(int i=0;i<n;i++)
			Table[i]=1;
		System.out.println(CatalanNumberMemoized(n, Table));
		*/
		
		/*int p[] = {40, 20, 30, 10, 30} ;
		int n=4;
		int[][] M = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				M[i][j]=Integer.MAX_VALUE;
		
		System.out.println(MatrixMultiplication(1,n,p,M));
		*/
	}
	static int longestIncSubsequence(int[] arr)
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
	
	static void LongestIncreasingContiguousSubsequence() //O(n)
	{
		int[] arr = {1,-3,4,-2,-1,6};
		int sum = 0;
		int maxSum = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			sum = Math.max(sum+arr[i], arr[i]);
			maxSum = Math.max(sum, maxSum);
		}
		System.out.println(maxSum);
	}
	
	static void LINoTwoConsequentSubsequence() //O(n)
	{
		int[] arr = {1,-3,4,-2,2,6};
		int[] maxArr = new int[arr.length];
		maxArr[0] = arr[0];
		maxArr[1] = Math.max(arr[0], arr[1]);
		
		for(int i=2;i<arr.length;i++)
			{
				maxArr[i] = Math.max(arr[i]+maxArr[i-2],maxArr[i-1]);
			}
		System.out.println(maxArr[arr.length-1]);
	}
	
	static void LINoThreeConsequentSubsequence()
	{
		//max M(i-1) or M(i-2)+a[i]  or M[i-3] + a[i]+a[i-1]
		int[] arr = {1,-3,4,-2,2,6,5,4,8,-4,1,3};
		int[] M = new int[arr.length];
		M[0] = arr[0];
		M[1] = Math.max(Math.max(arr[0], arr[1]),arr[0]+arr[1]);
		M[2] = Math.max(Math.max(Math.max(arr[0],arr[1]),arr[2]),Math.max(Math.max(arr[0]+arr[1], arr[0]+arr[2]), arr[1]+arr[2]));
		for(int i=3;i<arr.length;i++)
		{
			M[i] = Math.max(Math.max(M[i-1], M[i-2]+arr[i]), M[i-3]+arr[i-1]+arr[i]);
		}
		System.out.println(M[arr.length-1]);
	}
	
	/**
	 * No of BSTs with n nodes
	 * @param n
	 * @return
	 */
	static int CatalanNumber(int n)
	{
		int catalanCount = 0;
		if(n==0)
			return 1;
		else
			for(int i=1;i<=n;i++)
				catalanCount += CatalanNumber(i-1)*CatalanNumber(n-i);
		System.out.println(catalanCount);
		return catalanCount;
	}
	
	static int CatalanNumberMemoized(int n, int[] Table)
	{
		if(n==0)
			return 1;
		if(Table[n-1]!=1)
			return Table[n-1];
		Table[n-1]=0;
		for(int i=1;i<=n;i++)
			Table[n-1] += CatalanNumberMemoized(i-1, Table)*CatalanNumberMemoized(n-i, Table);
		return Table[n-1];
	}
	
	public static int MatrixMultiplication(int i, int j, int[] p, int[][] M)
	{
		if(M[i-1][j-1]<Integer.MAX_VALUE)
			return M[i-1][j-1];
		if(i==j)
		{
			M[i-1][j-1]=0;
			return M[i-1][j-1];
		}
		for(int k=i;k<j;k++)
		{
			int temp=MatrixMultiplication(i,k,p,M)*MatrixMultiplication(k+1,j,p,M)+p[i-1]*p[k]*p[j];
			if(temp<M[i-1][j-1])
				M[i-1][j-1]=temp;
		}
			
		return M[i-1][j-1];
	}
	
	
	

}
