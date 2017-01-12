import java.util.Scanner;

public class CatalanNumber {

	static int[] M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		M= new int[n+1];
		for(int i=0;i<M.length;i++)
			M[i]=-1;
		System.out.println(findCatalanNum(n));
	}
	
	public static int findCatalanNum(int n)
	{
		if(M[n]!=-1) //Memoization case
			return M[n];
		if(n<=1) //Input corner case
			return M[n] = 1;
		M[n] =0;
		for(int i=1;i<=n;i++)
			M[n] += findCatalanNum(i-1)*findCatalanNum(n-i);
		return M[n];
	}

}
