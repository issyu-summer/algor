package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main22 {

    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast=head,slow=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
