package Queues;
import java.util.*;

/*
enQueue(q,  x)
  1) Push x to stack1 (assuming size of stacks is unlimited).

deQueue(q)
  1) If both stacks are empty then error.
  2) If stack2 is empty
       While stack1 is not empty, push everything from stack1 to stack2.
  3) Pop the element from stack2 and return it.
*/

public class QueueUsingStack {

	public static void main(String[] args) {
		QStack q=new QStack();
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}

}

class QStack{
	static Stack<Integer> s1=new Stack<Integer>();
	static Stack<Integer> s2=new Stack<Integer>();
	
	public void enqueue(int x)
	{
		//Push x to stack1
		s1.push(x);
	}
	
	public int dequeue()
	{
		//If stack1 is empty then error.
		if(s1.isEmpty() && s2.isEmpty()) 
		{
			System.out.println("Empty queue!");
			return -1;
		}
		
		//If stack2 is empty, while stack1 is not empty, push everything from stack1 to stack2.
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				int temp=s1.pop();
				s2.push(temp);
			}
		}
		//Pop the element from stack2 and return it.
		int popped=s2.pop();
		System.out.println(popped);
		return popped;
		
	}
}
