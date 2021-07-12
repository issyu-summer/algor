package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main18 {

    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    public ListNode deleteNode(ListNode head, int val) {
        if(head==null){
            return null;
        }
        if(head.val==val){
            return head.next;
        }
        ListNode pre=head,cur=head.next;
        while (pre!=null&&cur!=null){
            if(cur.val==val){
                break;
            }
            pre=pre.next;
            cur=cur.next;
        }
        if(cur!=null){
            assert pre != null;
            pre.next=cur.next;
        }
        return head;
    }
}
