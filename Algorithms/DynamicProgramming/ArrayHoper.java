import java.util.*;

public class ArrayHoper {
	
	static int MAX=Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers=new ArrayList<>();
		try{
			String sb=new String();
			int num=0;
			while(!(sb=in.nextLine()).equals(""))
			{
				if(sb.isEmpty()||sb==null)
					break;
				num=Integer.parseInt(sb);
				numbers.add(num);
			}
			in.close();
			minPath(numbers);
		}
		catch (Exception ex) 
		{
			System.out.println("failure");
		}
	}
	
	public static void minPath(ArrayList<Integer> arr)
	{
		int size=arr.size();
		
		if(size==0 || arr.get(0)==0)
		{
			System.out.println("failure");
			return;
		}
		
		int[] minJumps = new int[size+1];
		minJumps[0]=0;
		int[] path = new int[size+1];
		path[0]=0;
		int i,j=0;
		
		for(i=1;i<size+1;i++)
		{
			minJumps[i]=MAX;
			for(j=0;j<i;j++)
			{
				if(i<=j+arr.get(j) && minJumps[j]!=MAX)
				{
					if(minJumps[j]+1<minJumps[i])
					{
						minJumps[i]=minJumps[j]+1;
						path[i]=j;	
					}
				}
			}
		}
		printPath(size+1, path, arr);
	}

	/**This method prints the sequence of array indices corresponding to minimum jumps. 
	 * @param size
	 * @param path
	 */
	private static void printPath(int size, int[] path, ArrayList<Integer> arr) {
		int i;
		StringBuilder sb=new StringBuilder();
		int limit=0;
		for(i=size-2; i>0; i--) // Handle cases where the hero can jump to end from any index prior to end
		{
			if((i+arr.get(i))>(size-2))
				limit=i;
		}
		if(limit>0)
		{
			for(i=limit;i>0;) // Back tracking the jumps
			{
				sb.insert(0, i+",");
					i=path[i];
			}
			System.out.print("0,"+sb+"out");
		}
		else
			System.out.println("failure");
	}

}
