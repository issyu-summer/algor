package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main25 {

    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode virtualHead=new ListNode(-1);
        ListNode tmp=virtualHead;
        while (l1!=null&&l2!=null){
            if (l1.val < l2.val) {
                tmp.next = l1;
                l1=l1.next;

            }else {
                tmp.next = l2;
                l2=l2.next;
            }
            tmp=tmp.next;
        }
        tmp.next=l1==null?l2:l1;
        return virtualHead.next;
    }
}
