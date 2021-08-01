package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
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

    private ListNode mid(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow=head,fast=head.next.next;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode h1,ListNode h2){
        ListNode dummy=new ListNode();
        ListNode tmp=dummy;
        while (h1!=null&&h2!=null){
            if(h1.val<h2.val){
                tmp.next=h1;
                h1=h1.next;
            }else {
                tmp.next=h2;
                h2=h2.next;
            }
            tmp=tmp.next;
        }
        tmp.next=h1==null?h2:h1;
        return dummy.next;
    }
}
