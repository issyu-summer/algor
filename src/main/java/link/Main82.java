package link;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/">删除排序链表中的重复元素II</a><br/>
 * 背过
 */
public class Main82 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummy= new ListNode(-1),cur=dummy;
        dummy.next=head;
        int tmp;
        while (cur.next!=null&&cur.next.next!=null){
            if((tmp=cur.next.val)==cur.next.next.val){
                while (cur.next!=null&&cur.next.val==tmp){
                    cur.next=cur.next.next;
                }
            }else {
                cur=cur.next;
            }
        }
        return dummy.next;
    }
}
