package Miscellaneous;
import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hmap=new HashMap<>();
		hmap.put("a", "abc");
		hmap.put("b","bcd");
		hmap.put("a", "ab");
		hmap.put("a", "abcd");
		hmap.put("c","cbd");
		System.out.println(hmap.get("a"));
	}

}
