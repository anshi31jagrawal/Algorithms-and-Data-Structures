
public class Floyd_ShortestPath {
	final static int max = 100000;
	static int[][] matrix = {{0,8,5},{3,0,max},{max,2,0}};
	static int n = matrix.length;
	public static void main(String[] args) {
		for(int del=0;del<n;del++)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					matrix[i][j] = Math.min(matrix[i][j], matrix[i][del]+matrix[del][j]);
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println();
			for(int j=0;j<n;j++)
				System.out.print(((matrix[i][j]==max)?"inf":matrix[i][j])+" ");
		}
	}
	
}
