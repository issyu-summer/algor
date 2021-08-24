package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
            return null;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        for (int i = 0; i <left-1; i++) {
            pre=pre.next;
        }
        ListNode cur=pre.next;
        for (int i = 0; i < right - left; i++) {
            ListNode next=cur.next;
            cur.next=next.next;
            next.next=pre.next;
            pre.next=next;
        }
        return dummy.next;
    }
}
