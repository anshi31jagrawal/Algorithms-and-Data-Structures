package Miscellaneous;
import java.util.ArrayList;
import java.util.Scanner;


/*
 * Pseudo Code for Median finding in infinite series using heaps:
 * 1. Maintain two heaps: maxHeap and minHeap -> maxHeap contains all numbers less than median & minHeap contains all numbers greater than median
 * 2. Get the new number and add it to maxHeap
 * 3. Check the count of MaxHeap and MinHeap
 * 	  if MaxHeap.count-MinHeap.count>1, remove max from maxHeap and add it to minHeap
 *    else add the number to maxHeap
 * 4. To find median :
 *    if the total number of elements added is odd, return max from maxHeap i.e. root of maxHeap
 *    else return average of max of maxHeap i.e. root of maxHeap and min of minHeap i.e. root of minHeap
 * 
 */

public class MedianInfiniteHeaps {

	public static void main(String[] args) {
	MaxHeap maxHeap = new MaxHeap(10);
	MinHeap minHeap = new MinHeap(10);
	Scanner in = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	int a=0;
	double median =0;
	int elements = 0;
	while((a=in.nextInt()) != -1)
	{
		//TODO: Complete the insertion part
		elements++;
		if(a<maxHeap.getMax())
			maxHeap.insert(a);
		else
			minHeap.insert(a);
		if(maxHeap.size-minHeap.size > 1)
		{
			int max = maxHeap.getMax();
			maxHeap.remove();
			minHeap.insert(max);
		}
		else
			if(minHeap.size-maxHeap.size > 1)
			{
				int min = minHeap.getMin();
				minHeap.remove();
				maxHeap.insert(min);
			}
		//System.out.println("maxHeap:");
		//maxHeap.print();
		//System.out.println("minHeap:");
		//minHeap.print();
		if(elements%2==0)
			median = (maxHeap.getMax()+minHeap.getMin())/2.0;
		else
			median = (maxHeap.size>minHeap.size)?maxHeap.getMax():minHeap.getMin();
		System.out.println("Median"+median);
	}
	}

}

