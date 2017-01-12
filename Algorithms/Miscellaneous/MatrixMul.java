package Miscellaneous;

public class MatrixMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{1,0,0},{0,1,0},{0,0,1},{0,0,0}};
		int[][] b={{1,2,1,2},{1,1,1,1}};
		int[][] c={{0,0,0},{0,0,0}};
		for(int i=0;i<b.length;i++)
			for(int j=0;j<a[0].length;j++)
				for(int k=0;k<b[0].length;k++)
					c[i][j]+=b[i][k]*a[k][j];
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
				System.out.print(c[i][j]+ "");
			System.out.println();
		}
	}

}
