import java.util.Scanner;

public class Fibonacci {

	static int M[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		M = new int[n+1];
		for(int i=0;i<M.length;i++)
			M[i]=-1;
		System.out.println(getFibonacci(n));
		
	}
	//0,1,1,2,3,5,8,13,21,34,55
	public static int getFibonacci(int n)
	{
		if(M[n] != -1)
			return M[n];
		if(n==0)
			return M[n] = 0;
		if(n==1)
			return M[n] = 1;
		M[n] = getFibonacci(n-1)+getFibonacci(n-2);
		return M[n];
	}

}