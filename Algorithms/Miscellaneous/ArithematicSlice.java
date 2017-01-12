package Miscellaneous;
import java.util.*;
public class ArithematicSlice {

	public static void main(String[] args) {
		int[] A={1,2,3,8,9,10};
		System.out.println(numberOfArithmeticSlices(A));
	}
	
	public static int numberOfArithmeticSlices(int[] A) {
        int curr=0;
        int sum=0;
        for(int i=2;i<A.length;i++)
            if(A[i]-A[i-1] == A[i-1]-A[i-2])
            {
                curr++;
                sum+=curr;//VERY IMP RESULT
            }
            else
                curr=0;
        return sum;
    }

}
