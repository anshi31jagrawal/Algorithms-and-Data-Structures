
public class SubstringOccurenecCount {

	static String S="geeksforgeeks";
	static String T="ge";
	static int n=S.length();
	static int m=T.length();
	static int[][] L = new int[m+1][n+1];
	public static void main(String[] args) {
		System.out.println(findOccurence());
	}
	
	public static int findOccurence() 
	{
		if(m>n)
			return 0;
		for(int i=0;i<=m;i++)
			L[i][0]=0;
		for(int j=0;j<=n;j++)
			L[0][j]=1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(T.charAt(i-1)==S.charAt(j-1))
					L[i][j]=L[i-1][j-1]+L[i][j-1];
				else
					L[i][j]=L[i][j-1];
			}
		}
		
		return L[m][n];
	}


}
