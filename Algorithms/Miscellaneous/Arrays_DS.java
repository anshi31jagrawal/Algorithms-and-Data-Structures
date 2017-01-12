package Miscellaneous;
import java.util.*;
public class Arrays_DS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int arr_i=0; arr_i < n; arr_i++)
		    arr[n-arr_i-1] = in.nextInt();
		System.out.println();
		for(int arr_i=0; arr_i < n; arr_i++)
		    System.out.print(arr[arr_i]+ " ");
	}
}
