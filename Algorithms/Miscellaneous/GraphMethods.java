package Miscellaneous;
import java.util.*;

public class GraphMethods {

	public static void main(String[] args) {
	Graph g=new Graph(4);
	g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);
    g.DFS(2);
	}

}

class Graph{
	ArrayList<Integer>[] arr;
	int Vertices;
	public Graph(int v)
	{
		Vertices = v;
		arr = new ArrayList[this.Vertices];
		for(int i=0;i<v;i++)
			arr[i] = new ArrayList<Integer>();
	}
	public int addEdge(int v1,int v2)
	{
		if(v1<Vertices)
		{
			this.arr[v1].add(v2);
			return v2;
		}
		return -1;
	}
	
	public void DFS(int a)
	{
		boolean visited[] = new boolean[this.Vertices];
		this.DFSUtil(a, visited);
	}
	
	public void DFSUtil(int a, boolean[] visited)
	{
		visited[a]=true;
		System.out.print(a+" ");
		Iterator<Integer> iter = arr[a].listIterator();
		while(iter.hasNext())
		{
			int v = iter.next();
			if(visited[v]==false)
				DFSUtil(v,visited);
		}
		
	}
	
}
