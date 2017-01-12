package Miscellaneous;
import java.util.*;

public class FrogJump {

	public static void main(String[] args) {
		int[] stones={0,1,2,3,4,8,9,11};
		System.out.println(canCross(stones));
	}
	
	public static boolean canCross(int[] stones) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>(stones.length);
        
        for(int i=0;i<stones.length;i++)
        	map.put(stones[i], new HashSet<Integer>());
        
        map.get(0).add(1);
        HashSet<Integer> temp=new HashSet<>();
        
        for(int i=0;i<stones.length-1;i++)
        {
        	int stone=stones[i];
        	for(int step: map.get(stone))
        	{
        		int reachable=stone+step;
        		if(reachable==stones[stones.length-1])
        			return true;
        		if(map.containsKey(reachable))
        		{
        			temp=map.get(reachable);
        			if(step-1>0)
        				temp.add(step-1);
        			temp.add(step);
        			temp.add(step+1);
        		}
        	}
        }
        
		return false;
    }

}
