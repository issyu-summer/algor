package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main25 {

    //合并两个排序链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1),tmp=dummy;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                tmp.next=l1;
                l1=l1.next;
            }else {
                tmp.next=l2;
                l2=l2.next;
            }
            tmp=tmp.next;
        }
        tmp.next=l1==null?l2:l1;
        return dummy.next;
    }
}
