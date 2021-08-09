import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(){}
        public ListNode(int val){
            this.val=val;
        }
    }

    private ListNode head;
    public Main(){
        this.head=null;
    }
    public void add(int val){
        if(head==null){
            head=new ListNode(val);
        }else {
            ListNode tmp=head;
            while (tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next=new ListNode(val);
        }
    }

    public void remove(int val){
        if(head==null){
            return;
        }
        if(head.val==val){
            head=null;
        }
        ListNode vHead=new ListNode(-1);
        vHead.next=head;
        ListNode cur=head,pre=vHead;
        while (cur!=null){
            if(cur.val==val){
                break;
            }
            cur=cur.next;
            pre=pre.next;
        }
        if(cur!=null) {
            pre.next = cur.next;
        }
    }
}
