package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main36 {

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };

    private Node pre;
    private Node head;
    public Node treeToDoublyList(Node root) {
        if(root==null){
            return null;
        }
        pre=null;
        head=null;
        dfs(root);
        pre.right=head;
        head.left=pre;
        return head;
    }

    private void dfs(Node cur){
        if(cur==null){
            return;
        }
        dfs(cur.left);
        if(pre==null){
            head=cur;
        }else {
            pre.right=cur;
            cur.left=pre;
        }
        pre=cur;
        dfs(cur.right);
    }
}
