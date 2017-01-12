package Miscellaneous;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HeapCmds {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        MinHeapCmd mh = new MinHeapCmd(10);
        for(int i=0;i<n;i++)
        {
            Integer order = in.nextInt();
            if(order == 3)
            {
                int min = mh.getMin();
                System.out.println(min);
            }
            else
            {
                if(order == 1)
                    mh.insert(in.nextInt());
                else
                    mh.remove(in.nextInt());   
            }
      }
    }
}
class MinHeapCmd{
    int[] Heap;
    int size;
    int maxsize;
    static final int FRONT=1;
    public MinHeapCmd(int maxsize)
    {
        this.maxsize = maxsize;
        this.size=0;
        this.Heap = new int[maxsize+1];
        Heap[0] = Integer.MIN_VALUE;
    }
    
    public int parent(int pos)
    {
        if(pos<=size)
            return pos/2;
        else
            return -1;
    }
    public int leftChild(int pos)
    {
        return pos*2;    
    }
    public int rightChild(int pos)
    {
        return pos*2+1;    
    }
    public void insert(int data)
    {
    	if(this.size==this.maxsize)
    		resizeHeap();
        Heap[++size] = data;
        int current = size;
        
        while(current>0 && Heap[current]<Heap[parent(current)])
        {
            swap(current,parent(current));
            current=parent(current);
        }
        
    }
    
    public void resizeHeap()
    {
    	int[] Heap_old = this.Heap;
    	int[] Heap_new = new int[this.maxsize*2];
    	if(Heap_new ==null)
    		System.out.println("Memory Error!");
    	else
    	{
    		System.arraycopy(Heap_old, 0, Heap_new, 0, this.size);
    	}
    	this.Heap = Heap_new;
    	this.maxsize*=2;
    }
    
    public void swap(int fpos, int spos)
    {
        int temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }
    public int remove(int ele)
    {
        if(this.size<=0)
            return -1;
        else
        {
        	if(ele == this.getMin())
        	{
	            int last = Heap[size--];
	            Heap[FRONT] = last;
	            minHeapify(FRONT);
	            return 1;
        	}
        	else
        	{
        		int pos = -1;
        		for(int i=1;i<=size;i++)
        		{
        			if(this.Heap[i]==ele)
        				pos = i; 
        		}
        		int last = Heap[size--];
	            Heap[pos] = last;
	            minHeapify(FRONT);
	            return 1;
        		
        	}
        }
    }
    public boolean isLeaf(int pos)
    {
        if(pos>size/2 && pos<=size)
            return true;
        else
            return false;
    }
    public void minHeapify(int pos)
    {
        if(!this.isLeaf(pos))
        {
            if(Heap[pos]>Heap[leftChild(pos)] || Heap[pos]>Heap[rightChild(pos)])
            {
                if(Heap[leftChild(pos)]<Heap[rightChild(pos)])
                {
                    swap(pos,leftChild(pos));    
                    minHeapify(leftChild(pos));
                }
                else
                {
                    swap(pos,rightChild(pos));    
                    minHeapify(rightChild(pos));
                }
            }
        }
    }
    
    public int getMin()
    {
        if(size<=0)
            return -1;
        else
            return Heap[FRONT];
    }
    
}