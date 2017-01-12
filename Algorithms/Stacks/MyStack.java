package Stacks;

import java.util.*;

//USING QUEUE
public class MyStack {
	
	Queue<Integer> q1=new ArrayDeque<Integer>();
	
    // Push element x onto stack.
    public void push(int x) {
    	q1.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
    	Queue<Integer> q2=new ArrayDeque<Integer>();
    	int size=q1.size();
    	for(int i=0;i<size-1;i++)
    	{
    		int num=q1.poll();
    		q2.offer(num);
    	}
    	q1=q2;
    }

    // Get the top element.
    public int top() {
    	Queue<Integer> q2=new ArrayDeque<Integer>();
    	int num=0;
    	int size=q1.size();
    	for(int i=0;i<size;i++)
    	{
    		num=q1.poll();
    		q2.offer(num);
    	}
    	q1=q2;
    	System.out.println(num);
    	return num;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
    
    public static void main(String args[])
    {
    	MyStack s=new MyStack();
    	s.push(1);
    	s.push(2);
    	s.push(3);
    	s.top();
    	s.pop();
    	s.top();
    	s.pop();
    	s.top();
    	s.empty();
    	s.pop();
    	s.empty();
    }
}
