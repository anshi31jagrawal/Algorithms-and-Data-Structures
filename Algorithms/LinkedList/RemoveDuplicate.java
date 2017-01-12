package LinkedList;

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class RemoveDuplicate {

	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(2);
		deleteDuplicates(head);

	}
	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next==null)
            return head;
        
        ListNode curr=head;
		ListNode prev=null;
		while(curr!=null && curr.next!=null)
		{
			if(curr.val==curr.next.val)
			{
			    while(curr.next!= null && curr.val==curr.next.val)
			    {
			        curr=curr.next;
			    }
			    if(prev==head)
			    {
			        head.next=curr.next;
			        prev.next=curr.next;
			    }
			    else
			    prev.next=curr.next;
			}
			
			curr=curr.next;
		}
		return head;
		
    }
}
