
public class LongestCommonSubsequence {

	static int M[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String X = new String("abcbdab");
		String Y = new String("bdcaba");
		M = new int[X.length()+1][Y.length()+1]; //n+1,m+1 : 0,0 = 0
		System.out.println(findLCS(X,Y));
	}

	public static int findLCS(String X, String Y)
	{
		for(int i=1;i<=X.length();i++)
		{
			for(int j=1;j<=Y.length();j++)
			{
				if(X.charAt(i-1)==Y.charAt(j-1))
					M[i][j] =  M[i-1][j-1]+1;
				else
					M[i][j] = Math.max(M[i-1][j], M[i][j-1]);
			}
		}
		return M[X.length()][Y.length()];
	}
}
