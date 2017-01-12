//O(n^2)
public class LongestPalindromeSubsequence {
	
	static String s="SGEEKGS";
	static int len = 0;
	static int n = s.length();
	static int[][] L = new int[n][n];
	
	public static void main(String[] args) {
	System.out.println(longestPalindromeSubsequence());	
	System.out.println(longestPalindromeSubsequence2());	
	System.out.println(LongestPalindromeSubstring());	

	}
	//Bottom-up Iterative Approach like Matrix Chain Multiplication
	public static int longestPalindromeSubsequence()
	{
		for(int i=0;i<n;i++)
			L[i][i]=1;
		for(int del=1;del<n;del++)
		{
			for(int i=0;i<n-del;i++)
			{
				int j=i+del;
				//if(s.charAt(i)==s.charAt(j) && del==1)
					//L[i][j]=2;
				//else
					if(s.charAt(i)==s.charAt(j))
						L[i][j]=2+L[i+1][j-1];
					else
						L[i][j]=Math.max(L[i+1][j], L[i][j-1]);
			}
		}
		return L[0][n-1];
	}
	
	
	public static int longestPalindromeSubsequence2()
	{
		int maxLen=1;
		for(int i=0;i<n;i++)
			L[i][i]=1;
		
		for(int i=0;i<n-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				L[i][i+1]=1;
				maxLen=2;
			}
			else
				L[i][i+1]=0;
		}
		
		for(int k=3;k<=n;k++)//k is the length of the substring that's y <=
		{
			for(int i=0;i<n-k+1;i++)
			{
				int j=i+k-1;
				if(s.charAt(i)==s.charAt(j))
				{
					L[i][j]=2+L[i+1][j-1];
					maxLen = k;
				}
				else
					L[i][j]=Math.max(L[i+1][j], L[i][j-1]);
			}
		}
		return maxLen;
	}
	
	public static int LongestPalindromeSubstring()
	{
		int maxLen=0;
		for(int i=0;i<n;i++)
			L[i][i]=1;
		
		for(int i=0;i<n-1;i++)
			if(s.charAt(i)==s.charAt(i+1))
			{
				L[i][i+1]=1;
				maxLen=2;
			}
		
		for(int k=3;k<=n;k++)//k is the length of the substring that's y <=
		{
			for(int i=0;i<n-k+1;i++)
			{
				int j=i+k-1;
				if(s.charAt(i)==s.charAt(j) && L[i+1][j-1]==1)
				{
					L[i][j]=1;
					maxLen = k;
				}
				else
					L[i][j]=0;
			}
		}
		return maxLen;
	}
}
