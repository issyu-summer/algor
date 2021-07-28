package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main24 {

    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode newH=head.next;
        head.next=swapPairs(newH.next);
        newH.next=head;
        return newH;
    }
}
