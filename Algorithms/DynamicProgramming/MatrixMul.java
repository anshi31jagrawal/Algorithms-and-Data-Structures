
public class MatrixMul {

	static int[][] M=new int[4][4];
	static int[] P = {10, 20, 30, 40, 30};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(matrixMul());
		
	}
	
	public static int matrixMul()
	{
		int n= M.length;
		for(int l=0;l<n;l++)
			M[l][l]=0;
		for(int del = 1;del<n;del++)
		{
			for(int i=0;i<n-del;i++)
			{
				int j=i+del;
				M[i][j]=Integer.MAX_VALUE;
				for(int k=i;k<j;k++)
				{
					int temp = M[i][k]+M[k+1][j]+P[i]*P[k+1]*P[j+1];
					if(temp<M[i][j])
						M[i][j]=temp;
				}
				
			}
		}
		return M[0][n-1];
	}

}
