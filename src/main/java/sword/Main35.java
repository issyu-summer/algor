package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main35 {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        //复制一份
        Node cur=head;
        while (cur!=null){
            Node node = new Node(cur.val);
            node.next=cur.next;
            cur.next=node;
            cur=node.next;
        }
        //复制随机指针
        cur=head;
        while (cur!=null){
            if(cur.random!=null){
                cur.next.random=cur.random.next;
            }
            cur=cur.next.next;
        }
        //拆分
        Node pre=head;
        cur=head.next;
        Node res=head.next;
        while (cur.next!=null){
            pre.next=cur.next;
            cur.next=cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next=null;
        return res;
    }
}
