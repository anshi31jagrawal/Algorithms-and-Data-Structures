package Sorts;
public class BubbleSort{
	
	public static void main(String args[]){
		int[] Array={2,4,6,5,9,8,1,3};
		System.out.println("Array:");
		Print(Array);
		int[] SortedArray = BubbleSortMethod(Array); 
		System.out.println("Sorted Array:");
		Print(SortedArray);
	}
	
	public static int[] BubbleSortMethod(int[] a) 
	{
		//Best-case Time Complexity: O(n^2)//
		for(int pass=a.length-1;pass>=0;pass--){//Here, pass is the largest element which after this iteration is placed at its correct
			for(int i=0;i<=pass-1;i++)		   
				if(a[i]>a[i+1]){
					//swap elements
					int temp = a[i]; 
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			//Uncomment below 2 lines to print each iteration
			//System.out.println("Array after "+(a.length-pass)+" iteration:");
			//Print(a);
			}
		return a;
	}
	public static void Print(int[] array){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
}