package repeat;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/">sw52.两个链表的第一个公共节点</a><br/>
 */
public class Main52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA,t2=headB;
        while (t1!=t2){
            t1=t1==null?headB:t1.next;
            t2=t2==null?headA:t2.next;
        }
        return t1;
    }
}
