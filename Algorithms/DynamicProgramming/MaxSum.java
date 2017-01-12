import java.util.Scanner;

public class MaxSum {
	static int[] M;
	static int[] seq;//={-2, -3, 4, -1, -2, 1, 5, -3}; -2 -3 4 -1 -2 1 5 -3
	static int AnswerMaxSum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		for(int j=0;j<tc;j++)
		{
			int n=in.nextInt();
			seq= new int[n];
			M=new int[n];
			for(int i=0;i<n;i++)
				{seq[i]=in.nextInt();
				M[i]=Integer.MIN_VALUE;
				}
			M[0]=seq[0];
			System.out.println(findMaxContiguousSum()+" "+kadane()+" "+findMaxNonContiguousSum(n-1));
		}
	}
	public static int findMaxContiguousSum()
	{
		int sum=0;
		AnswerMaxSum = seq[0];
		
		for(int i=0;i<seq.length;i++)
		{
			sum= Math.max(sum+seq[i], seq[i]);
			AnswerMaxSum=Math.max(sum,AnswerMaxSum);
		}
		
		return AnswerMaxSum;
	}
	
	public static int kadane()
	{
		 /*Kadane’s Algorithm:

			Initialize:
			    max_so_far = 0
			    max_ending_here = 0

			Loop for each element of the array
			  (a) max_ending_here = max_ending_here + a[i]
			  (b) if(max_ending_here < 0)
			            max_ending_here = 0
			  (c) if(max_so_far < max_ending_here)
			            max_so_far = max_ending_here
			return max_so_far*/
		
		int sumEndingHere=0;
		int sumSoFar=0;
		boolean allNegative=true;
		int maxNegative = Integer.MIN_VALUE;
		for(int i=0;i<seq.length;i++)
		{
			if(seq[i]>=0)
				allNegative=false;
			if(maxNegative<seq[i] && seq[i]<=0)
				maxNegative=seq[i];
		}
		if(allNegative==true)
			return maxNegative;
		for(int i=0;i<seq.length;i++)
		{
			sumEndingHere+=seq[i];
			if(sumEndingHere<0)
				sumEndingHere=0;
			if(sumSoFar<sumEndingHere)
				sumSoFar=sumEndingHere;
		}
		//System.out.println(sumSoFar);
		return sumSoFar;
	}
	
	public static int findMaxNonContiguousSum(int j)
	{
		/*if(M[j]!=Integer.MIN_VALUE)
		return M[j];
		int maxSum = Integer.MIN_VALUE;
		maxSum = Math.max(findMaxNonContiguousSum(j-1)+seq[j], findMaxNonContiguousSum(j-1));
		if(maxSum>M[j])
			M[j] = maxSum;
		return maxSum;
		*/
		int maxNegative=Integer.MIN_VALUE;
		int sumPositive=0;
		boolean allNegative=true;
		for(int i=0;i<seq.length;i++)
		{
			if(seq[i]>=0)
				allNegative=false;
			if(maxNegative<seq[i] && seq[i]<=0)
				maxNegative=seq[i];
			if(seq[i]>0)
				sumPositive+=seq[i];
		}
		if(allNegative==true)
			return maxNegative;
		else
			return sumPositive;
	}

}
