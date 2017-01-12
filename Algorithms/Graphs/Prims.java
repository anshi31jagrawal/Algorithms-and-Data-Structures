package graphProblems;

public class Prims {

	static int graph[][] = new int[][] {{0, 2, 0, 6, 0},
        {2, 0, 3, 8, 5},
        {0, 3, 0, 0, 7},
        {6, 8, 0, 0, 9},
        {0, 5, 7, 9, 0},
       };
      static int n=graph.length;
      static int[] key = new int[n];
      static int[] parent = new int[n];
      static boolean[] MST =new boolean[n];
	public static void main(String[] args) {
		for(int i=0;i<n;i++)
		{
			key[i]=Integer.MAX_VALUE;
			MST[i]=false;
		}
		key[0]=0;
		parent[0]=-1;
		primMST();
		printMST();

	}
	
	public static void primMST()
	{
		for(int count=0;count<n-1;count++)
		{
			int u=minKey();
			MST[u]=true;
			
			for(int v=0;v<n;v++)
			{
				if(graph[u][v]!=0 && MST[v]==false && key[v]>graph[u][v])
				{
					key[v]=graph[u][v];
					parent[v]=u;
				}
			}
		}
	}
	
	public static int minKey()
	{
		int minIndex=-1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(MST[i]==false && key[i]<min)
			{
				min=key[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static void printMST()
	{
		for(int i=1;i<n;i++)
		{
			System.out.println(parent[i]+"-->"+i+":"+graph[parent[i]][i]);
		}
	}
	
}
