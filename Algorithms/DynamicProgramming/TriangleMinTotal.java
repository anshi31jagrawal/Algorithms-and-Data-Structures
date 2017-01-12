import java.util.*;
public class TriangleMinTotal {

	public static void main(String[] args) {
		List<List<Integer>> triangle=new ArrayList<List<Integer>>();
		List temp=new ArrayList<Integer>();
		temp.add(0,2);
		triangle.add(temp);
		temp=new ArrayList<Integer>();
		temp.add(0,3);
		temp.add(1,4);
		triangle.add(temp);
		temp=new ArrayList<Integer>();
		temp.add(0,6);
		temp.add(1,5);
		temp.add(2,7);
		triangle.add(temp);
		temp=new ArrayList<Integer>();
		temp.add(0,4);
		temp.add(1,1);
		temp.add(2,8);
		temp.add(3,3);
		triangle.add(temp);
		temp=new ArrayList<Integer>();
		System.out.println(minimumTotal(triangle));
		System.out.println(findDiff());
		
			
	}

	/**
	 * 
	 */
	private static String findDiff() {
		String s="abcd";
		String t="abcde";
		String longer=(s.length()>t.length())?s:t;
		String shorter=(s.length()<t.length())?s:t;
		
		for(int i=0;i<shorter.length();i++)
		{
			longer=longer.replace(shorter.charAt(i), ' ');
		}
		longer=longer.trim();
		return longer;
	}
	
	public static int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-2;i>=0;i--)
        {
        	for(int j=0;j<triangle.get(i).size();j++)
        	{
        		triangle.get(i).set(j, triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
        	}
        }
        return triangle.get(0).get(0);
    }

}
