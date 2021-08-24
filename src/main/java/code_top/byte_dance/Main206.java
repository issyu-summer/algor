package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main206 {

    //反转链表
    public ListNode reverseList(ListNode head) {
        ListNode pre=null,cur=head;
        while (cur!=null){
            ListNode tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;
    }
}
