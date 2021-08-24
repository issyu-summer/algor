package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main18 {

    //删除链表中的节点
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy,cur=head;
        while (cur.val!=val){
            pre=pre.next;
            cur=cur.next;
        }
        pre.next=cur.next;
        return dummy.next;
    }
}
