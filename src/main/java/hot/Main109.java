package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main109 {

    private ListNode head;
    public TreeNode sortedListToBST(ListNode head) {
        this.head=head;
        return recur(head,null);
    }

    private TreeNode recur(ListNode l,ListNode r){
        if(l==r){
            return null;
        }
        ListNode mid = mid(l, r);
        TreeNode node=new TreeNode(mid.val);
        node.left=recur(l,mid);
        node.right=recur(mid.next,r);
        return node;
    }


    //快慢指针找中间的节点
    private ListNode mid(ListNode l,ListNode r){
        ListNode slow=l,fast=l;
        while (fast!=r&&fast.next!=r){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
