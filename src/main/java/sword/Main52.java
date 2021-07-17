package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main52 {

    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmpA=headA;
        ListNode tmpB=headB;
        while (tmpA!=tmpB){
           tmpA=tmpA!=null?tmpA.next:headB;
           tmpB=tmpB!=null?tmpB.next:headA;
        }
        return tmpA;
    }
}
