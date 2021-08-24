package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ta=headA,tb=headB;
        while (ta!=tb){
            ta=ta==null?headB:ta.next;
            tb=tb==null?headA:tb.next;
        }
        return ta;
    }
}
