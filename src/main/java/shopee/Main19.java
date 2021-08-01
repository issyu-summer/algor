package shopee;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode vHead=new ListNode();
        vHead.next=head;
        ListNode slow=vHead,fast=head;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        if(slow.next!=null){
            slow.next=slow.next.next;
        }
        return head;
    }
}
