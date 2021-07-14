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
        ListNode node=head;
        for(ListNode tmp=head;tmp!=null;tmp=tmp.next){
            if(k--<=0){
                node=node.next;
            }
        }
        return node;
    }
}
