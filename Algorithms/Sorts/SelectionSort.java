package Sorts;

public class SelectionSort {

	public static void main(String[] args) {
		int[] Array={2,4,6,5,9,8,1,3};
		System.out.println("Array:");
		Print(Array);
		int[] SortedArray = SelectionSortMethod(Array); 
		System.out.println("Sorted Array:");
		Print(SortedArray);
	}
	
	public static int[] SelectionSortMethod(int[] a){
		//It is called as Selection sort as it repeatedly selects the smallest element//
		//Best-case, Worst-case, Average-case Time Complexity: O(n^2)//
		//In-place algorithm, doesn't require extra memory//
		//Efficient for small data//
		int min,i,j,temp;
		for(i=0;i<a.length;i++){
			min=i;
			for(j=i+1;j<a.length;j++)
				if(a[j]<a[min]){
					temp = a[min];
					a[min] = a[j];
					a[j] = temp;
				}
			//Uncomment below 2 lines to print each iteration
			//System.out.println("Array after "+(i+1)+" iteration:");
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
