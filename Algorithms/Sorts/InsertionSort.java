package Sorts;
public class InsertionSort {

	public static void main(String[] args) {
		int[] Array={9,7,6,5,2,8,1,3};
		System.out.println("Array:");
		Print(Array);
		int[] SortedArray = InsertionSortMethod(Array); 
		System.out.println("Sorted Array:");
		Print(SortedArray);
	}
	
	public static int[] InsertionSortMethod(int[] a){
		//It is called as (online) insertion sort as it places the key element at its correct place in each iteration//
		//Remember for the above fact we consider [0-key] element array for correct place of key element//
		//Advantages: In-place, adaptive, stable, online//
		//Best-case,Average-case,Worst-case time complexity: O(n^2), worst: when the list is decreasingly sorted//
		//Efficient for small data//
		int i,j,key;
		for(i=1; i<a.length;i++){
			key=a[i];
			j=i-1;
			while(j>=0 && a[j]>key){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			//Uncomment below 2 lines to print each iteration
			System.out.println("Array after "+(i-1)+" iteration:");
			Print(a);
		}
		return a;
	}
	
	public static void Print(int[] array){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}

}
