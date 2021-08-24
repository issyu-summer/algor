package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main328 {

    public ListNode oddEvenList(ListNode head) {
        ListNode odd=head,evenHead=head.next,even=evenHead;
        while (even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
