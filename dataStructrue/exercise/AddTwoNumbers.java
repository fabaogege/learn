package exercise;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null){
            return null;
        }
        //定义指针
       ListNode dummyHead = new ListNode(-1);
       ListNode prev = dummyHead;
       ListNode p1 = l1;
       ListNode p2 = l2;
        //2链表对应的val的值，相加后的结果，以及前面的链表值的和的进位值
        int x = 0;
        int y = 0;
        int sum = 0;
        int carry = 0;
       while(p1 != null || p2 != null){
           //l1链表的值
          if(p1 == null){
              x = 0;
          }else{
              x= p1.val;
              p1 = p1.next;
          }
           //l2链表的值
           if(p2 == null){
                y = 0;
           }else{
                y =p2.val;
               p2 = p2.next;
           }
           sum = carry+x+y;
           //进位值
           carry = sum/10;
           //个位
           prev.next = new ListNode(sum%10);
           prev = prev.next;
       }
        //当2个链表都到末尾时候，如果加起来还有进位值的话，也要建立一个节点
        if(carry>0){
            prev.next = new ListNode(carry);
        }
        return dummyHead.next;

	}
}
