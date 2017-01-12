package Miscellaneous;
import java.util.*;

public class MedianInInfinite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Integer[] Array={9,7,6,5,2,8,1,3};
		//System.out.println("Array:");
		//Print(Array);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a=0;
		double median =0;
		while((a=in.nextInt()) != -1)
		{
			list.add(a);
			Integer[] arr = new Integer[list.size()];
			arr=list.toArray(arr);
			median = InsertionSortMethod(arr);
			System.out.println("Median:"+median);
		}
	}
	
	public static void Print(Integer[] array){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	public static double InsertionSortMethod(Integer[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		Print(arr);
		if(arr.length%2==0)
			return(((arr[arr.length/2]+arr[arr.length/2-1])/2.0));
		else
			return(arr[arr.length/2]);
	}

}
