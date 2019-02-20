package exercise;

public class RemoveLinkedListElements {
	 public ListNode removeElements(ListNode head, int val) {
		 //不适用虚拟头节点的方法
		//如果头节点的val就是要找的val,
         while(head!=null && head.val ==val ){
             head = head.next;
         }
         if(head ==null){
             return head;
         }
         //删除head.next位置
         ListNode prev = head;
         while(prev.next!=null){
             if(prev.next.val == val){
                 prev.next = prev.next.next;
             }else{
                 prev = prev.next;
             }
         }
         return head;
	 }
	 public ListNode removeElement(ListNode head, int val) {
		 //使用虚拟头节点的方法
		 ListNode dummyHead = new ListNode(-1);
		 dummyHead.next = head;
		 
		 ListNode prev = dummyHead;
		 while(prev.next!=null){
             if(prev.next.val == val){
                 prev.next = prev.next.next;
             }else{
                 prev = prev.next;
             }
         }
		 return dummyHead.next;
		 
	 }
	 public ListNode removeElementByDigui(ListNode head, int val) {
		 //使用递归的方式
		 
		 if(head == null) {
			 return head;
		 }
		 ListNode res=  removeElements(head.next,val);
		 if(head.val ==val) {
			 return res;
		 }else {
			 return head.next = res;
		 }
	 }
}
