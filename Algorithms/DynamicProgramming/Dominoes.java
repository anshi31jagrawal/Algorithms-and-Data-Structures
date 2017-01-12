
public class Dominoes {

	static int length=11;
	static int[] M=new int[length+1];;
	public static void main(String[] args) {
		for(int i=0;i<=length;i++)
			M[i]=-1;
		System.out.println(findMaxDominoes(length));
		
	}
	
	public static int findMaxDominoes(int len)
	{
		if(M[len]!=-1)
			return M[len];
		if(len == 0)
			return M[0]=0;
		if(len == 1)
			return M[1]=1;
		if(len == 2)
			return M[2]=2;
		M[len]= (findMaxDominoes(len-1))+(findMaxDominoes(len-2));
		return M[len];
	}

}
