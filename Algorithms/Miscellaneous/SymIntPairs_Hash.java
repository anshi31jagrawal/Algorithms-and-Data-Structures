package Miscellaneous;
import java.util.Hashtable;
import java.util.Map.Entry;

public class SymIntPairs_Hash {

	public static void main(String[] args) {
		int pairs[][]={{1,3},{2,6},{3,5},{7,4},{5,3},{4,7}};
		Hashtable<Integer, Integer> h=new Hashtable<>();
		for(int i=0;i<pairs.length;i++)
		{
			h.putIfAbsent(pairs[i][0], pairs[i][1]);
			if(h.containsKey(pairs[i][1]) && h.get(pairs[i][1])==pairs[i][0])
			{
				System.out.println("{"+pairs[i][0]+","+pairs[i][1]+"};{"+pairs[i][1]+","+pairs[i][0]+"};");
			}
		}
	}

}
