package DFS_Backtracking;

public class ReachDestinationWithBlockage {

	static int N=4;
	static int[][] board ={{0,  0, 0, 0},
            			   {0, -1, 0, 0},
            			   {-1, 0, 0, 0},
            			   {0,  0, 0, 0}};
	public static void main(String[] args) {
		solve();

	}
	public static void solve()
	{
		if(board[0][0]==-1)
		{
			System.out.println("0");
			return;
		}
		else
			board[0][0]=1;
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				if(!(board[i][j]==-1))
				{
					if(i>0 && board[i-1][j]>0)
						board[i][j]+=board[i-1][j];
					if(j>0 && board[i][j-1]>0)
						board[i][j]+=board[i][j-1];
				}
			}
		}
		System.out.println(board[board.length-1][board[board.length-1].length-1]);
	}
}
