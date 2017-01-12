package Miscellaneous;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class IntSetsEqual {

	public static void main(String[] args) {
		int[] a={2,5,6,7,10,8,2};
		int[] b={2,5,8,7,8,2,10};
		Hashtable<Integer, Integer> h_a=new Hashtable<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(h_a.containsKey(a[i]))
				h_a.put(a[i], (h_a.get(a[i])+1));
			h_a.putIfAbsent(a[i],1);
		}
		Hashtable<Integer, Integer> h_b=new Hashtable<Integer, Integer>();
		boolean diff=false;
		for(int i=0;i<b.length;i++)
		{
			if(h_b.containsKey(b[i]))
				h_b.put(b[i], (h_b.get(b[i])+1));
			h_b.putIfAbsent(b[i],1);
			//If we need to check that both arrays are same
			if(h_a.containsKey(b[i]))
				h_a.put(b[i], (h_a.get(b[i])-1));
			else
				diff=true;
			//If we need to check that both arrays are same
		}
		Set<Integer> s_a=h_a.keySet();
		Set<Integer> s_b=h_b.keySet();
		if(s_a.equals(s_b))
			System.out.println("Yes");
		else
			System.out.println("NO");
		Collection<Integer> c = h_a.values();
		for(Integer cs:c)
			if(cs!=0)
				diff=true;
		System.out.println(diff);
		

	}

}
