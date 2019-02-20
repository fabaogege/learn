package exercise;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode prev = dummyHead;
        ListNode p1 = l1;
        ListNode p2 = l2;
        
        while(p1 != null || p2 != null){
            if(p1 == null){
                prev.next = p2;
                break;
            }
            if(p2 == null){
                prev.next = p1;
                break;
            }
            if(p1.val<p2.val){
                prev.next= p1;
                p1 = p1.next;
                prev = prev.next;
            }else{
                prev.next = p2;
                p2 = p2.next;
                prev = prev.next;
            }
            
        }
        return dummyHead.next;
    }
}
