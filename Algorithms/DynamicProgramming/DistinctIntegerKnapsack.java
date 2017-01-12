// TODO: Check logic and functionality
public class DistinctIntegerKnapsack {

	static int[] wt;
	static int[] val;
	static int W;
	static int[][] M;
	public static void main(String args[])
	{
	    val = new int[]{60, 100, 120};
	    wt = new int[]{10, 20, 30};
	    W = 50;
	    M=new int[val.length][W+1];
	    for(int i=0;i<val.length;i++)
	    	for(int j=0;j<M.length;j++)
	    		M[i][j] =-1;
	    System.out.println(distinctKnapSack(W));
	}
	
	public static int distinctKnapSack(int W)
	{
		
		return M[val.length][W];
	}

}
