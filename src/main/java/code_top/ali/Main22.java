package code_top.ali;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main22 {

    //链表的倒数第K个节点
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow=head,fast=head;
        for (int i = 0; i < k; i++) {
            fast= fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
