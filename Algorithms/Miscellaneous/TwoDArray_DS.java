package Miscellaneous;
import java.util.*;
public class TwoDArray_DS {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int arr[][]= new int[6][6];
		
		int max_sum = 0;
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++)
				arr[i][j]=in.nextInt();
		
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++){
				int sum = 0;
				sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if(max_sum<=sum)
					max_sum=sum;
			}
		System.out.println(max_sum);
	}				
}
