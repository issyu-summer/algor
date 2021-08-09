package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main{
    static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }

    }
    public  ListNode reverse(ListNode head){
        ListNode cur=head,pre=null;
        while(cur!=null){
            ListNode tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;
    }
    public static void main(String []args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        ListNode tmp=new Main().reverse(head);
        while(tmp!=null){
            System.out.println(tmp.val);
            tmp=tmp.next;
        }
    }
}
