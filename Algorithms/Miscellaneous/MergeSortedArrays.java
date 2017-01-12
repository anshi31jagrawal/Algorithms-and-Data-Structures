package Miscellaneous;

public class MergeSortedArrays {
		public static void main(String args[])
		{
			int nums1[]={0};
			int nums2[]={1};
			int m=0;
			int n=nums2.length;
			merge(nums1,m,nums2,n);
		}
	    public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        if(nums1==null || m==0)
	        {
	                nums1=nums2;
	                return;
	        }
	        if(nums2==null || n==0)
	        {
	        	return;
	        }
	        int p=m+n-1;
	        int p1=m-1;
	        int p2=n-1;
	        while(p1>-1 && p2>-1)
	        {
	            if(nums1[p1]>nums2[p2])
	            nums1[p--]=nums1[p1--];
	            else
	            nums1[p--]=nums2[p2--];
	        }
	        if(p1>-1)
	        {
	            while(p1>-1)
	            {
	                nums1[p--]=nums1[p1--];
	            }
	        }
	        if(p2>-1)
	        {
	            while(p2>-1)
	            {
	                nums1[p--]=nums2[p2--];
	            }    
	        }
	        
	    }
	
}
