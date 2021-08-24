package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast=head,slow=head;
        for (int i = 0; i < k; i++) {
            fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
