package DFS_Backtracking;

import java.util.Arrays;

public class EqualSumPartition {

	public static void main(String[] args) {
		int[] nums={5,1,2,1,3,3,3};
		System.out.println(isEqualSumPossible(nums));

	}
	
	public static boolean isEqualSumPossible(int[] nums)
	{
		if(nums==null || nums.length<2)
			return false;
		
		int sum=0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i];
		if(sum%2!=0)
			return false;
		sum/=2;
		int[] AB =new int[2];
		Arrays.sort(nums);
		return dfs(nums, AB, nums.length-1, sum);
	}
	
	public static boolean dfs(int[] nums, int[] AB, int index, int sum)
	{
		if(index==0)
		{
			if(AB[0]==sum)
				return true;
			return false;
		}
		
		for(int i=0;i<2;i++)
		{
			if(AB[i]+nums[index]>sum) continue;
			AB[i]+=nums[index];
			if(dfs(nums, AB, index-1, sum)) return true;
			AB[i]-=nums[index];
		}
		
		
		return false;
	}
	

}
