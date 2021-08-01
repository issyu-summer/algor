package shopee;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main141 {

    public boolean hasCycle(ListNode head) {
        //是否有环fast=head
        ListNode slow=head,fast=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
