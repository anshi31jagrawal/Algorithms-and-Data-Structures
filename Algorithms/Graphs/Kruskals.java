package graphProblems;
import java.util.*;

class Edge
{
	int weight;
	int src;
	int dest;
	
	public Edge(int w, int s, int d)
	{
		this.weight=w;
		this.src=s;
		this.dest=d;
	}
}
public class Kruskals {
	  static int n;
	  static ArrayList<Edge> map=new ArrayList<Edge>();
      static ArrayList<Edge> MST= new ArrayList<Edge>();
      public static void main(String[] args) {
    	 /* map.add(new Edge(10,0,1));
    	  //map.add(new Edge(10,1,0));
    	  map.add(new Edge(6,0,2));
    	  //map.add(new Edge(6,2,0));
    	  map.add(new Edge(5,0,3));
    	  //map.add(new Edge(5,3,0));
    	  map.add(new Edge(15,1,3));
    	  //map.add(new Edge(15,3,1));
    	  map.add(new Edge(4,2,3));
    	  //map.add(new Edge(4,3,2));
*/    	  
    	  
    	  map.add(new Edge(7,1,3));
    	  map.add(new Edge(5,1,4));
    	  map.add(new Edge(8,2,3));
    	  map.add(new Edge(5,2,5));
    	  map.add(new Edge(9,3,4));
    	  map.add(new Edge(7,3,5));
    	  map.add(new Edge(15,4,5));
    	  map.add(new Edge(6,4,6));
    	  map.add(new Edge(8,5,6));
    	  map.add(new Edge(9,5,7));
    	  map.add(new Edge(11,6,7));
    	  n=map.size();
    	  Comparator<Edge> myComp = new Comparator<Edge>() {
			
			@Override
			public int compare(Edge arg0, Edge arg1) {
				Integer w0 = arg0.weight;
				Integer w1 = arg1.weight;
				return w0.compareTo(w1);
			}
		};
    	  Collections.sort(map, myComp);
    	  ArrayList<Integer> verticesInMST = new ArrayList<Integer>();
    	  for(int count=0;count<n-1;count++)
    	  {
    		  for(int i=0;i<map.size();i++)
    		  {
    			  int src = map.get(i).src;
    			  int des = map.get(i).dest;
    			  if(!(verticesInMST.contains(src) && verticesInMST.contains(des)))
    			  {
    				  MST.add(map.get(i));
    				  if(!verticesInMST.contains(src))
    					  verticesInMST.add(src);
    				  if(!verticesInMST.contains(des))
    					  verticesInMST.add(des);
    			  }
    		  }
    	  }
    	  for(int j=0;j<MST.size();j++)
    	  {
    		  Edge e=MST.get(j);
    		  System.out.println(e.src+"--"+e.dest+":"+e.weight);
    	  }
	}

}
