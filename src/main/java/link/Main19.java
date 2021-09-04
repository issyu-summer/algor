package link;

/**
 * @author summer
 * @see <a href=" * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">删除链表的倒数第N个节点</a><br/>
 * dummy+快慢指针
 */
public class Main19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1,head);
        ListNode slow=head,fast=dummy;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        if(slow.next!=null){
            slow.next=slow.next.next;
        }
        return dummy.next;
    }
}
