//O(mn)
public class NoOfPaths {
	static int m=3;
	static int n=3;
	static int[][] matrix = new int[m][n];
	public static void main(String[] args) {
		for(int i=0;i<m;i++)
			matrix[i][0]=1;
		for(int j=0;j<n;j++)
			matrix[0][j]=1;
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				matrix[i][j]=matrix[i-1][j]+matrix[i][j-1]+matrix[i-1][j-1];
			}
		}
		System.out.println(matrix[m-1][n-1]);
	}

}
