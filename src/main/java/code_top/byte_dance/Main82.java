package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main82 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummy=new ListNode(-1,head);
        ListNode cur=dummy;
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
