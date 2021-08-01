package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main876 {

    public ListNode middleNode(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode slow=head,fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
