package Miscellaneous;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class HashDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Character, Integer> h = new Hashtable<Character, Integer>();
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String ans="";
		for(int i=0;i<s.length();i++)
			if(h.containsKey(s.charAt(i)))
				h.put(s.charAt(i),(h.get(s.charAt(i))+1));
			else
				h.put(s.charAt(i),1);
		Set<Character> keys=h.keySet();
		Collection<Integer> values=h.values();
		for(Character k:keys)
			ans+=k+"";
		System.out.print(ans);
		ans="";
		for(Integer v:values)
			ans+=v+"";
		System.out.print(ans);
		
	}

}
