package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ta=headA,tb=headB;
        while (ta!=tb){
            ta=ta!=null?ta.next:headB;
            tb=tb!=null?tb.next:headA;
        }
        return ta;
    }
}
