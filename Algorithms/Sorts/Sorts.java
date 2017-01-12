package Sorts;

public class Sorts {

	public static void main(String[] args) {
		int[] Array={9,7,6,5,2,8,1,3};
		System.out.println("Array:");
		Print(Array);
		int[] InsertionArray = InsertionSortMethod(Array); 
		System.out.println("Insertion Array:");
		Print(InsertionArray);
		int[] BubbleArray = ImprovedBubbleSort(Array); 
		System.out.println("Bubble Array:");
		Print(BubbleArray);

	}
	
	public static void Print(int[] array){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	public static int[] InsertionSortMethod(int[] arr)
	{
		int[] ans = arr;
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
		return ans;
	}
	
	public static int[] QuickSortMethod(int[] arr)
	{
		int[] ans = arr;
		
		return ans;
	}
	
	public static int[] ImprovedBubbleSort(int[] arr)
	{
		int[] ans = arr;
		boolean swapped=false;
		for(int pass=arr.length-1;pass>=0 && swapped; pass--)
		{
			swapped=true;
			for(int i=0;i<=pass;i++)
				if(arr[i]<arr[i+1])
				{
					int temp=arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
		}
		return ans;
	}
	
	

}
