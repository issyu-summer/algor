package link;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/sort-list/">排序链表</a><br/>
 * 归并排序
 */
public class Main148 {

    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid=mid(head);
        ListNode rHead=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(rHead);
        return merge(left,right);
    }

    private ListNode merge(ListNode h1, ListNode h2) {
        ListNode dummy=new ListNode(-1),cur=dummy;
        while (h1!=null&&h2!=null){
            if(h1.val<h2.val){
                cur.next=h1;
                h1=h1.next;
            }else {
                cur.next=h2;
                h2=h2.next;
            }
            cur=cur.next;
        }
        return dummy.next;
    }

    private ListNode mid(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head,fast=head.next.next;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
