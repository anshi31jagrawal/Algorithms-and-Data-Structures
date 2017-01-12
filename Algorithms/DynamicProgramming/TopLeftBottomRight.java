
public class TopLeftBottomRight {
	static int[][] matrix = {{1,2,3,4},{1,1,1,1},{9,9,9,9}};
	static int[][] maxApple = new int[matrix.length+1][matrix[0].length+1];
	public static void main(String[] args) {
		for(int i=0;i<maxApple.length;i++)
			maxApple[i][0]=0;
		for(int j=0;j<maxApple[0].length;j++)
			maxApple[0][j]=0;
		for(int i=1;i<maxApple.length;i++)
		{
			for(int j=1;j<maxApple[0].length;j++)
			{
				maxApple[i][j]+=Math.max(Math.max(maxApple[i-1][j],maxApple[i][j-1]),maxApple[i-1][j-1])+matrix[i-1][j-1];
			}
		}
		
		/*for(int i=0;i<maxApple.length;i++)
		{
			System.out.println();
			for(int j=0;j<maxApple[0].length;j++)
				System.out.print(maxApple[i][j]+",");
		}*/
		
		System.out.println(maxApple[maxApple.length-1][maxApple[0].length-1]);
	}

}
