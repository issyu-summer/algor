package shopee;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Sword22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode vHead=new ListNode();
        vHead.next=head;
        ListNode slow=vHead,fast=head;
        for (int i = 0; i < k; i++) {
            fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.next;
    }
}
