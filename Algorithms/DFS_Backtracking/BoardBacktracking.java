package DFS_Backtracking;

public class BoardBacktracking {

	static int N=8;
	public static void main(String[] args) {
		solve();

	}
	public static void solve()
	{
		int sol[][] =new int[N][N]; //initialize board
		for(int i=0;i<N;i++) 
			for(int j=0;j<N;j++)
				sol[i][j]=0;
		sol[0][0]=0; //Starting point (0,0)

		//Possible moves
		int[] xMove={};
		int[] yMove={};

		if(solveUtil(0,0,sol,1,xMove,yMove))
			printSol(sol);
		else
			System.out.println("No solution!");
	}

	public static boolean solveUtil(int x,int y, int[][] sol, int moveIndex, int[] xMove, int[] yMove)
	{
		//Termination Condition
		if(moveIndex==N*N)
			return true;
		//Check all possible next moves from current coordinate
		int k,nextX,nextY;
		for(k=0;k<xMove.length;k++)
		{
			nextX=x+xMove[k];
			nextY=y+yMove[k];
			
			if(isSafe(nextX,nextY,sol)) //check feasibility of next move 
			{
				sol[nextX][nextY]=moveIndex; //make next move
				if(solveUtil(nextX, nextY, sol, moveIndex+1, xMove, yMove)) //does this move give a solution. If yes, return true, else backtrack.
					return true;
				else
					sol[nextX][nextY]=-1;//Backtracking: remove last move
			}

		}
		return false;

	}

	/**
	 * This method checks if the move is feasible on the N*N board
	 * @param x : Row Index
	 * @param y : Column Index
	 * @param sol : board
	 * @return : boolean
	 */
	private static boolean isSafe(int x, int y, int[][] sol) {
		if(x>=0 && x<N && y>=0 && y<N)//&&
			return true;	
		return false;
	}
	
	/**
	 * Prints board solution, if exists
	 * @param sol : board
	 */
	public static void printSol(int[][] sol)
	{
		for(int i=0;i<sol.length;i++)
		{
			for(int j=0;j<sol.length;j++)
				System.out.print(sol[i][j]+" ");
			System.out.println();
		}
	}
}
