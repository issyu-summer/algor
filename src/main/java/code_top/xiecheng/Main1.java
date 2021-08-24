package code_top.xiecheng;

import uf.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1 {

    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    private Node generateTree(Integer[] nums){
        Node root=new Node(nums[0]);
        Queue<Node> queue=new LinkedList<>(){{
            add(root);
        }};
        int i=1;
        int len=nums.length;
        while (!queue.isEmpty()){
            Node node = queue.poll();
            if(nums[i]!=null) {
                node.left = new Node(nums[i]);
                queue.add(node.left);
            }
            i++;
            if(nums[i]!=null){
                node.right=new Node(nums[i]);
                queue.add(node.right);
            }
            i++;
            if(i>=len){
                break;
            }
        }
        return root;
    }

    List<Integer> res=new ArrayList<>();
    private void preorder(Node root){
       if(root==null){
           return;
       }
//       res.add(root.val);
       preorder(root.left);
       System.out.print(root.val+",");
       preorder(root.right);
    }

    public static void main(String[] args) {
        Integer[] integers = {
                1, 2, 3, null, null, 4, 5
        };
        Node node=new Main1().generateTree(integers);
        new Main1().preorder(node);

    }
}
