package Miscellaneous;
public class MaxHeap
{
	public int[] Heap;
	public int size;
	public int maxsize;
 
	public static final int FRONT = 1;
 
    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }
 
    public int parent(int pos)
    {
        return pos / 2;
    }
 
    public int leftChild(int pos)
    {
        return (2 * pos);
    }
 
    public int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
 
    public boolean isLeaf(int pos)
    {
        if (pos >=  (size / 2)  &&  pos <= size)
        { 
            return true;
        }
        return false;
    }
 
    public void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
 
    public void maxHeapify(int pos)
    {
        if (!isLeaf(pos))
        { 
            if ( Heap[pos] < Heap[leftChild(pos)]  || Heap[pos] < Heap[rightChild(pos)])
            {
                if (Heap[leftChild(pos)] > Heap[rightChild(pos)])
                {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                }else
                {
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }
 
    public void insert(int element)
    {
        Heap[++size] = element;
        int current = size;
 
        while (Heap[current] > Heap[parent(current)])
        {
            swap(current,parent(current));
            current = parent(current);
        }	
    }
 
    public void print()
    {
    	for (int i = 1; i <= size; i++ )
        {
        	int leftChild =-1;
        	int rightChild =-1;
        	if(2*i<=maxsize)
        		leftChild = Heap[2*i];
        	if(2 * i  + 1<=maxsize)
        		rightChild = Heap[2 * i  + 1];
        	System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + leftChild 
                + " RIGHT CHILD :" + rightChild);
        	
            System.out.println();
        }
    }
 
    public int remove()
    {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--]; 
        maxHeapify(FRONT);
        return popped;
    }
    
    public int getMax()
	{
		if(this.size == 0)
			return -1;
		else
			return this.Heap[FRONT];
	}
    
    public static void main(String...arg)
    {
        System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap(6);
        maxHeap.insert(1);
        maxHeap.insert(2);
        maxHeap.insert(3);
        maxHeap.insert(9);
        maxHeap.insert(10);
        maxHeap.insert(12);
        /*minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.minHeap();
 */
        maxHeap.print();
        System.out.println("The Max val is " + maxHeap.Heap[FRONT]);
        
    }
}