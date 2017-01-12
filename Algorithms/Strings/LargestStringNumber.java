package Strings;

import java.util.Arrays;
import java.util.Comparator;

public class LargestStringNumber {

	public static void main(String[] args) {
		int[] nums={3, 30, 34, 5, 9};
		System.out.println(largestNumber(nums));
		
	}
	public static String largestNumber(int[] nums) {
        String ans="";
        if(nums==null || nums.length==0)
        	return ans;
        String[] numArr=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        	numArr[i]=String.valueOf(nums[i]);
        
        Comparator<String> comp = new Comparator<String>() {
			
			@Override
			public int compare(String arg0, String arg1) {
				String s1=arg0+arg1;
				String s2=arg1+arg0;
				return s2.compareTo(s1);
			}
		};
		Arrays.sort(numArr,comp);
		for(int i=0;i<nums.length;i++)
			ans+=numArr[i];
        
        return ans;
    }
}
