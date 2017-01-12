package Miscellaneous;
import java.util.*;

class Interval
{
	int start;
	int end;
	 
	public Interval()
	{
		this.start=0;
		this.end=0;
	}
	
	public Interval(int s, int e)
	{
		this.start=s;
		this.end=e;
	}
}
public class MergeIntervals {
	
	public static void main(String[] args) {
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(15,18));
		intervals.add(new Interval(8,10));
		intervals.add(new Interval(2,6));
		intervals.add(new Interval(1,3));
		intervals.add(new Interval(17,20));
		ArrayList<Interval> result =mergeIntervals(intervals);
		for(int i=0;i<result.size();i++)
		{
			Interval a=result.get(i);
			System.out.println("["+a.start+","+a.end+"]");
		}
		
	}
	
	
	public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals)
	{
		if(intervals==null || intervals.size()<2)
			return intervals;
		
		ArrayList<Interval> mergedIntervals = new ArrayList<Interval>();
		
		Comparator<Interval> compareInterval=new Comparator<Interval>() {
			
			@Override
			public int compare(Interval a, Interval b) {
				Integer a_s=a.start;
				Integer b_s=b.start;
				return(a_s.compareTo(b_s));
			}
		};
		intervals.sort(compareInterval);
		//Collections.sort(intervals,compareInterval);
		
		Interval current = intervals.get(0);
		for(int i=1;i<intervals.size();i++)
		{
			Interval compareToInterval = intervals.get(i);
			if(current.end<compareToInterval.start)
			{
				mergedIntervals.add(current);
				current=compareToInterval;
			}
			else
			{
				current.end=Math.max(current.end, compareToInterval.end);				
			}
		}
		mergedIntervals.add(current);
		return mergedIntervals;
	}
}
