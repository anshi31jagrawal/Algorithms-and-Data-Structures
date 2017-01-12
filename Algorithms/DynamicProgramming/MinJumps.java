
public class MinJumps {
	static int[] jumps = {1, 3, 6, 1, 0, 9};//{1, 3, 6, 3, 2, 3, 6, 8, 9, 5};
	static int[] minJumps = new int[jumps.length+1];
	static int[] prevIndex = new int[jumps.length+1];
	public static void main(String[] args) {
		
		if(jumps.length==0 || jumps[0]==0)
		{
			System.out.println("Not possible!");
			return;
		}
		minJumps[0]=0;
		
		for(int i=1;i<jumps.length;i++)
		{
			int min=Integer.MAX_VALUE;
			for(int j=0;j<i;j++)
			{
				if(i<=j+jumps[j] && minJumps[j]<min)
				{
					min = minJumps[j]+1;
					minJumps[i]=min;
					prevIndex[i]=j;
				}
			}
		}
		System.out.println(minJumps[jumps.length-1]);
		for(int i=0;i<minJumps.length;i++)
			System.out.print(minJumps[i]+",");
		System.out.println("Indices:");
		for(int i=0;i<prevIndex.length;i++)
			System.out.print(prevIndex[i]+",");
		
	}
}
