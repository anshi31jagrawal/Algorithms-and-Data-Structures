package Sorts;
public class ShellSort {

	public static void main(String[] args) {
		int[] Array={9,87,66,35,24,48,81,36,53,94,61,83,21,2,74,59,99,11};
		System.out.println("Array:");
		Print(Array);
		int[] SortedArray = ShellSortMethod(Array); 
		System.out.println("Sorted Array:");
		Print(SortedArray);
	}
	
	public static int[] ShellSortMethod(int[] a){
		//It is also called as diminishing increment sort and n-gap insertion sort since it is a generalization of insertion sort.//
		//Sequence of h1,h2,h3...hn is called as increment sequence//
		//Advantages: In-place, adaptive, stable, online//
		//Best-case: O(n),Average-case: depends on gap sequence,Worst-case time complexity: O(n(logn)^2), worst: when the list is decreasingly sorted//
		//Efficient for small data//
		int i,j,h,key;
		for(h=1;h<a.length/3;h=3*h+1);
		for(;h>0;h=h/3){
			for(i=h; i<a.length;i++){
				key=a[i];
				j=i;
				while(j>=h-1 && a[j-h]>key){
					a[j]=a[j-h];
					j-=h;
				}
				a[j]=key;
				//Uncomment below 2 lines to print each iteration
				System.out.println("h:"+h+", Array after "+(i-1)+" iteration:");
				Print(a);
			}
		}
		return a;
	}
	
	public static void Print(int[] array){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}

}
