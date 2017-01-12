import java.util.*;

public class BridgeBuilding {
	static int[] cities1 ={3,6,1,8,2,4,9,5,7};
	static int[] cities2 ={2,4,3,9,5,1,6,7,8};
	static int[][] cities = new int[cities1.length][2];
	static int[] L=new int[cities2.length]; //Memoization Array
	public static void main(String[] args) {
		//Sorting cities1 to get corresponding order of cities2
		for(int i=0;i<cities2.length;i++)
		{
			cities[i][0] = cities2[i];
			cities[i][1] = cities1[i];
		}
		Arrays.sort(cities, new Comparator<int[]>() {
			public int compare(int[] a, int[] b){
				return Integer.compare(a[0], b[0]);
			}
		});
		longestCitiesSequence();
	}
	
	/**
	 * Finds the longest increasing subsequence of cities in cities2 array sorted according to cities1 
	 * as each city in cities1 should match only with the corresponding city in cities2.
	 */
	public static void longestCitiesSequence()
	{
		//Initializing to count the city itself.
		for(int i=0;i<L.length;i++)
			L[i]=1;
		for(int i=0;i<cities.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(cities[j][1]<cities[i][1] && L[i]<L[j]+1)
					L[i]=L[j]+1;
			}
		}
		int maxIndex = 0;
		for(int i=0;i<L.length;i++)
		{
			if(maxIndex<L[i])
				maxIndex=L[i];
		}
		System.out.println("Max no. of bridges:"+maxIndex);
	}
}
