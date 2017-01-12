package DFS_Backtracking;
import java.util.*;

public class DFS_SquareMatchSticks {

	public static void main(String[] args) {
		int[] matchSticks={5,5,5,5,4,4,4,4,3,3,3,3};
		System.out.println(makesquare(matchSticks));

	}
	
	public static boolean makesquare(int[] nums) {
		if(nums == null || nums.length<4)
			return false;
		int sum=0;
		for(int i:nums)
			sum+=i;
		if(sum%4!=0)
			return false;
		int side=(sum/4);
		
		Arrays.sort(nums);
		int[] SidesSum= new int[4];
		return dfs(nums, SidesSum, nums.length-1, side);
        
    }

	/**
	 * @param nums
	 * @param side
	 * @return
	 */
	private static boolean dfs(int[] nums, int[] SidesSum, int index, int side) {
		
		if(index==0)
		{
			if(SidesSum[0]==side && SidesSum[1]==side && SidesSum[2]==side)
			{
				return true;
			}
			return false;
		}
		for(int j=0;j<4;j++)
		{
			if(SidesSum[j]+nums[index]>side) continue;
			else
			{
				SidesSum[j]+=nums[index];
				if(dfs(nums,SidesSum,index-1,side)) return true;
				SidesSum[j]-=nums[index];
			}
		}	
			
		return false;
	}

}
