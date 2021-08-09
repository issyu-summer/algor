package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode vHead=new ListNode(-1);
        ListNode tmp=vHead;
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                tmp.next=l1;
                l1=l1.next;
            }else {
                tmp.next=l2;
                l2=l2.next;
            }
            tmp=tmp.next;
        }
        tmp.next=l1!=null?l1:l2;
        return vHead.next;
    }
}
