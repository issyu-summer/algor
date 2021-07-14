package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main24 {

    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null) {
            ListNode tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;
//        return recur(head,null);
    }

    private ListNode recur(ListNode cur,ListNode pre){
        if(cur==null){
            return pre;
        }
        ListNode res=recur(cur.next,cur);
        cur.next=pre;
        return res;
    }
}
