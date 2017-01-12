package Miscellaneous;

public class Findword {

	static char[][] puzzle= {{'a','v','b','r','t','d'},{'n','u','s','o','t','d'},{'r','p','e','y','t','z'},{'d','l','b','r','p','q'}};
	static String word = "rose";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = puzzle.length;
		int col = puzzle[0].length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(puzzle[i][j]==word.charAt(0))
				{
					int old_i=i;
					int old_j=j;
					int k=0;
					for(k=1;k<word.length();k++)
					{
						if(i-1>0 && puzzle[i-1][j]==word.charAt(k) )
							i--;
						else 
							if(i+1<row && puzzle[i+1][j]==word.charAt(k))
							i++;
						else
							if(j-1>0 && puzzle[i][j-1]==word.charAt(k))
								j--;
						else
							if(j+1<col && puzzle[i][j+1]==word.charAt(k))
								j++;
						else
							break;
					}
					if(k==word.length())
					{
						System.out.println("Found!");
						return;
					}
					else
					{
						i=old_i;
						j=old_j;
					}
				}
			}
		}
		System.out.println("Not found!");
	}
	
	public static int findNearLetter(int i,int j,int index)
	{
		if(puzzle[i-1][j]==word.charAt(index))
			return 1;
		if(puzzle[i+1][j]==word.charAt(index))
			return 2;
		if(puzzle[i][j-1]==word.charAt(index))
			return 3;
		if(puzzle[i][j+1]==word.charAt(index))
			return 4;
		else
			return -1;
	}

}
