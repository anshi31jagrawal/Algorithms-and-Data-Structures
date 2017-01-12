package Miscellaneous;

public class moveZeros {

	public static void main(String[] args) {
		int[] arr ={1,0,3,0,12};
		moveZeroes(arr);
	}
	
	public static void moveZeroesOld(int[] nums) {
	    int i=0;
	    int j=0;
	 
	    while(j<nums.length){
	        if(nums[j]==0){
	            j++;
	        }else{
	            nums[i]=nums[j];
	            i++;
	            j++;
	        }
	    }
	 
	    while(i<nums.length){
	        nums[i]=0;
	        i++;
	    }
	    for(int k=0;k<nums.length;k++)
	    	System.out.print(nums[k]+",");
	}
	
	public static void moveZeroes(int[] nums) {
	    int i=0;
		for(int j=0;j<nums.length;j++)
	    {
	    	if(nums[j]!=0)
	    	{
	    		nums[i]=nums[j];
	    		i++;
	    	}
	    }
		
		for(;i<nums.length;i++)
			nums[i]=0;
		
	    for(int k=0;k<nums.length;k++)
	    	System.out.print(nums[k]+",");
	}
	

}
