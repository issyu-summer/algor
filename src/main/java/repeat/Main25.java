package repeat;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/">sw25.合并两个排序的链表</a><br/>
 */
public class Main25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1),cur=dummy;
        while (l1!=null&&l2!=null){
            if(l1.val< l2.val){
                cur.next=l1;
                l1=l1.next;
            }else {
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        cur.next=l1==null?l2:l1;
        return dummy.next;
    }
}
