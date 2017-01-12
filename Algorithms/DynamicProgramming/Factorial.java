import java.util.Scanner;

public class Factorial {

	static int M[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		M = new int[t+1];
		for(int i=0;i<M.length;i++)
			M[i] = -1;
		System.out.println(getFactorial(t));
	}
	
	public static int getFactorial(int n)
	{
		if(M[n]!=-1)
			return M[n];
		if(n==0 || n==1)
			return M[n]=1;
		M[n]=n*getFactorial(n-1);
		return M[n];
	}
}
