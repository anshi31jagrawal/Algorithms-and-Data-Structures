package LinkedList;
import java.util.*;

	class myLinkedList{
		myNode head;
		myLinkedList()
		{
			this.head=null;
		}
		
		//Reverse : current->head ; prev->null ; while(curr!=null) {//save the next node// next->curr.next; //make current point to prev// curr.next=prev; 
																	//update previous// prev=curr; //update current// curr=next;}
		public myNode addNode(int d)
		{
			myNode head=this.head;
			if(head==null)
				return this.head=new myNode(d);
			myNode curr=this.head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=new myNode(d);
			return head;
		}
		
		public myNode delNode(int d)
		{
			myNode head=this.head;
			if(head==null)
				return null;
			if(head.data==d)
				return this.head=head.next;
			myNode curr=head;
		while(curr.next!=null && curr.next.data!=d)
		{
			curr=curr.next;
		}
		myNode dnode=curr.next;
		curr.next=dnode.next;
		dnode.next=null;
		return this.head;
			
			
		}
		
		public void print()
		{
			System.out.println("\nList->");
			myNode curr=this.head;
			while(curr!= null)
				{System.out.print(curr.data+" ");
				curr=curr.next;
				}
		}
		
		public void findIntersection(myLinkedList l2)
		{
			
			myNode head1 = this.head;
			myNode head2 = l2.head;
			int len1=1;
			int len2=1;
			while(head1.next!=null || head2.next!=null)
			{
				if(head1.next!=null)
				{
					len1++;
					head1=head1.next;
				}
				if(head2.next!=null)
				{
					len2++;
					head2=head2.next;
				}
			}
			myNode longer=null;
			myNode smaller = null;
			int blen=0;
			if(len1>len2)
				{longer=this.head;blen=len1;smaller=l2.head;}
			else
				{longer=l2.head;blen=len2;smaller=this.head;}
			int diff=Math.abs(len1-len2);
			
			for(int i=0;i<diff;i++)
				longer=longer.next;
			myNode curr=smaller;
			while(longer!=curr)
			{
				longer=longer.next;
				curr=curr.next;
				
			}
			if(longer!=null)
			System.out.println("\nIntersection:"+longer.data);
		}
		
		
	}

	class myNode{
		int data;
		myNode next;
		myNode(int d)
		{
			this.data=d;
			this.next=null;
		}
		
	}

	public class myLinkedListMethods {
		
	    public static void main(String args[])
	    {
	        myLinkedList list1= new myLinkedList();
	        list1.addNode(1);
	        list1.addNode(2);
	        list1.addNode(3);
	        list1.addNode(4);
	        list1.addNode(5);
	        list1.addNode(6);
	        list1.addNode(7);
	        list1.addNode(8);
	        list1.print();
	        
	        
	        
	        //#### FIND INTERSECTION ####
	        myLinkedList list2= new myLinkedList();
	        list2.addNode(12);
	        //list2.addNode(11);
	        /*myNode common = list1.head;
	        for(int i=0;i<7;i++)
	        	common=common.next;
	        myNode current = list2.head;
	        while(current.next!=null)
	        	current=current.next;
	        current.next=common;*/
	        list2.print();
	        
	        list1.findIntersection(list2);
	    }
	}


