package Sorts;

public class BubbleSortImproved {

	public static void main(String args[]){
		int[] Array={2,4,6,5,9,8,1,3};
		System.out.println("Array:");
		Print(Array);
		int[] SortedArray = ImprovedBubbleSortMethod(Array); 
		System.out.println("Sorted Array:");
		Print(SortedArray);
	}
	
	public static int[] ImprovedBubbleSortMethod(int[] a) 
	{ 
		// Here we consider the fact that if there is no swap in the first iteration,// 
		//then the list is already sorted. Further iterations are not allowed//
		//Best-case Time Complexity: O(n) , stable, adaptive//
		boolean swapped = true;
		for(int pass=a.length-1;pass>=0 && swapped;pass--){
			swapped = false;
			for(int i=0;i<=pass-1;i++)		   
				if(a[i]>a[i+1]){
					//swap elements
					int temp = a[i]; 
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped = true;
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
