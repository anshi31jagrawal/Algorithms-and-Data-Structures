//TODO: Check functionality and implementation
public class SubsetSum {
	static int W=7;
	static int[] seq={3,2,4,19,3,7,13,10,6,11};
	static boolean[][] M; //0-1 matrix
	public static void main(String[] args) {
		isSubsetSumFound();
	}
	
	public static boolean isSubsetSumFound()
	{
		M=new boolean[seq.length+1][W+1];
		for(int i=0;i<=seq.length;i++)
			M[i][0]=true;
		for(int j=1;j<=W;j++)
			M[0][j]=false;
		for(int i=1;i<seq.length;i++)
		{
			for(int j=1;j<W;j++)
			{
				M[i][j] = M[i-1][j];
				if(j>=seq[i-1])
					M[i][j]=M[i][j] || M[i-1][j-seq[i-1]];
			}
		}
		System.out.println(M[seq.length][W]);
		return M[seq.length][W];	
		
	}
	
	
	
	
	/*public static boolean isSubsetSumFound()
	{
		if(W==0)
			return true;
		if(W<0 || seq.length<=0)
			return false;
		M=new boolean[W+1][seq.length+1];
		for(int i=1;i<W+1;i++)
		{
			M[i][0]=false;
		}
		for(int i=0;i<seq.length+1;i++)
		{
			M[0][i]=true;
		}
		
		for(int i=1;i<W+1;i++)
		{
			for(int j=1;j<seq.length+1;j++)
			{
				M[i][j]=M[i][j-1]; 
				if(i>seq[j-1])	
					M[i][j]=M[i][j] || (M[i-seq[j-1]][j-1]);
			}
		}
		System.out.println(M[W][seq.length]);
		return M[W][seq.length];
	}	
*/
}
