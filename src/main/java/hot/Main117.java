package hot;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main117 {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node> queue=new LinkedList<>(){{
            offer(root);
        }};
        while (!queue.isEmpty()){
            int len=queue.size();
            Node last = null;
            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                if(i!=0){
                    last.next=node;
                }
                last=node;
            }
        }
        return root;
    }
}
