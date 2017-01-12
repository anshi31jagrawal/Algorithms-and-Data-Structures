package Sorts;

public class Sort {

	public static void main(String[] args) {
		int[] Array={2,4,6,5,9,8,1,3};
		System.out.println("Array:");
		Print(Array);
		int[] SortedArray = SortMethod(Array); 
		System.out.println("Sorted Array:");
		Print(SortedArray);
	}
	
	public static int[] SortMethod(int[] a){
	
		return a;
	}
	
	public static void Print(int[] array){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}

}
