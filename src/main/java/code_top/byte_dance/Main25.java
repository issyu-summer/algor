package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main25 {

    //k个一组翻转连链表
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        while (head!=null){
            ListNode tail=pre.next;
            for (int i = 0; i < k; i++) {
                tail=tail.next;
                if(tail==null){
                    return dummy.next;
                }
                ListNode next=tail.next;
                ListNode[] nodes = reverse(head, tail);
                head = nodes[0];
                tail = nodes[1];
                pre.next=head;
                tail.next=next;
                pre=tail;
                head=tail.next;
            }
        }
        return dummy.next;
    }

    private ListNode[] reverse(ListNode head,ListNode tail){
        ListNode pre=tail.next,cur=head;
        while (pre!=tail){
            ListNode tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return new ListNode[]{
                tail,head
        };
    }

}
