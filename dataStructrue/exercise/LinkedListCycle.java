package exercise;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        if(head ==null){
            return false;
        }
        if(head.next ==null){
            return false;
        }
        ListNode slow =head;
        ListNode fast =head.next;
        while(fast!=null && fast.next !=null){
            //分2种情况的追上，当快慢指针都走一次，快指针在慢指针的前面，一个是快指针刚好跳到慢指针的位置，
            if(fast == slow || fast.next ==slow){
                return true;
            }
            fast =fast.next.next;
            slow = slow.next;
        }
        return false;
    }
    
}
