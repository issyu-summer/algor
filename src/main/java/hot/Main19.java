package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode virtualHead=new ListNode(-1);
        virtualHead.next=head;
        ListNode slow=virtualHead,fast=head;
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
        return virtualHead.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        new Main19().removeNthFromEnd(head,2);
    }
}
