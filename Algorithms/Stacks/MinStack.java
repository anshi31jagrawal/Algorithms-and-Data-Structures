package Stacks;
//EACH HEAD NODE HAS ITS OWN MIN. 
//WHEN THE NODE POPPED IS CORRESPONDING TO THE MIN NODE, THE HEAD CHANGES TO NEXT HEAD AND THE NEXT MIN CALL RETURNS THE MIN VALUE CORRESPONDING TO THAT HEAD NODE.
public class MinStack {
	Node head;
    
    public MinStack() {
       
    }
    
    public void push(int x) {
        if(head==null)
        	head=new Node(x,x);
        else
        	head=new Node(x,Math.min(x, head.min),head);
    }
    
    public void pop() {
    	head=head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    
    class Node
    {
    	int val;
    	int min;
    	Node next;
    	
    	public Node(int x, int min)
    	{
    		this(x,min,null);
    	}
    	
    	public Node(int x, int min, Node next)
    	{
    		this.val=x;
    		this.min=min;
    		this.next=next;
    	}
    }
}


