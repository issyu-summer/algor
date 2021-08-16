package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main52 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ta=headA,tb=headB;
        while (ta!=tb){
            ta=ta==null?headB:ta.next;
            tb=tb==null?headA:tb.next;
        }
        return ta;
    }
}
