package sword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main6 {

    private List<Integer> ar;

    public static int[] reversePrint1(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int size = stack.size();
        int[] ret = IntStream.range(0, size).map(i -> stack.pop()).toArray();
        return ret;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        int[] ints = reversePrint1(head);
        System.out.println(Arrays.toString(ints));
    }

    public int[] reversePrint(ListNode head) {
        ar = new ArrayList<>();
        recur(head);
        int[] ret = new int[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            ret[i] = ar.get(i);
        }
        return ret;
    }

    public void recur(ListNode head) {
        if (head == null) {
            return;
        }
        recur(head.next);
        ar.add(head.val);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
