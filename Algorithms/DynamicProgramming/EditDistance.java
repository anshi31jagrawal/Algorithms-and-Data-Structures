
public class EditDistance {

	static int[][] M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String X="saturday";
		String Y="sunday";
		M=new int[X.length()+1][Y.length()+1];//0 length of X and Y
		editDistance(X,Y);
		
	}
	public static int editDistance(String X, String Y)
	{
		for(int i=0;i<=X.length();i++)
			M[i][0]=i;
		for(int j=0;j<=Y.length();j++)
			M[0][j]=j;
		for(int i=0;i<X.length();i++)
		{
			for(int j=0;j<Y.length();j++)
			{
				if(X.charAt(i)==Y.charAt(j))
					M[i+1][j+1]=M[i][j];
				else
					M[i+1][j+1]=Math.min(Math.min(M[i][j+1], M[i+1][j]),M[i][j])+1;
			}
		}
		System.out.println(M[X.length()][Y.length()]);
		return M[X.length()][Y.length()];
	}
}
