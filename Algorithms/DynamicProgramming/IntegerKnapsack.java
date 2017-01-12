//TODO: Check logic and functionality
public class IntegerKnapsack {

	static int[] wt;
	static int[] val;
	static int W;
	static int[] M;
	public static void main(String args[])
	{
	    val = new int[]{60, 100, 120};
	    wt = new int[]{10, 20, 30};
	    W = 50;
	    M=new int[W+1];
	    for(int i=0;i<M.length;i++)
	    	M[i] =-1;
	    System.out.println(knapSack(W));
	}
	
	public static int knapSack(int j)
	{
		if(M[j]!=-1)
			return M[j];
		if(j<=0)
			return M[j]=0;
		int temp=0;
		int maxVal=0;
		for(int i=0;i<val.length;i++)
		{
			if(wt[i]<=j)
			{
				temp = knapSack(j-wt[i])+val[i];
				if(temp>maxVal)
					maxVal=temp;
			}
		}
		M[j] = Math.max(M[j-1], maxVal);
		return M[j];
	}

}
