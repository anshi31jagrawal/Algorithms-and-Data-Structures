
public class SubMatrix {
	static int[][] matrix ={{0, 1, 1, 0, 1}, 
            				{1, 1, 0, 1, 0}, 
            				{0, 1, 1, 1, 0},
            				{1, 1, 1, 1, 0},
            				{1, 1, 1, 1, 1},
            				{0, 0, 0, 0, 0}};
	static int[][] L=new int[matrix.length][matrix[0].length];
	public static void main(String[] args) {
		for(int i=0;i<matrix.length;i++)
			L[i][0]=matrix[i][0];
		for(int j=0;j<matrix[0].length;j++)
			L[0][j]=matrix[0][j];
		for(int i=1;i<matrix.length;i++)
		{
			for(int j=1;j<matrix[0].length;j++)
			{
				if(matrix[i][j]==1)
					L[i][j]=Math.min(L[i-1][j-1], Math.min(L[i][j-1], L[i-1][j]))+1;
				else
					L[i][j]=0;
			}
		}
		int max=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(max<L[i][j])
					max=L[i][j];
			}
		}
		for(int i=0;i<max;i++)
		{
			System.out.println();
			for(int j=0;j<max;j++)
			{
				System.out.print(1);
			}
		}
		System.out.println("\n"+max);
	}
}
