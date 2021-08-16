package array;

import java.util.Scanner;
import java.util.Stack;

/**
 * Dijkstra双栈计算
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Evaluate {

    private Stack<Double> nums;
    private Stack<String> operations;

    public Evaluate(){
        nums = new Stack<>();
        operations=new Stack<>();
    }

    public double value(){
        Scanner scanner=new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        for (char aChar : chars) {
            eva(aChar);
        }
        return nums.pop();
    }

    private void eva(char aChar) {
        String next = String.valueOf(aChar);
        switch (next) {
            case "(":
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                operations.push(next);
                break;
            case ")":
                String op = operations.pop();
                Double va = nums.pop();
                if (op.equals("+")) {
                    va += nums.pop();
                }
                if (op.equals("-")) {
                    va -= nums.pop();
                }
                if (op.equals("*")) {
                    va *= nums.pop();
                }
                if (op.equals("/")) {
                    va /= nums.pop();
                }
                nums.push(va);
                break;
            default:
                nums.push(Double.parseDouble(next));
                break;
        }
    }

    public static void main(String[] args) {
        Evaluate evaluate=new Evaluate();
        System.out.println(evaluate.value());
    }

}
