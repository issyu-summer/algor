package code_top.aiqiyi;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;
/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main3 {

        public static void main(String[] args) {
            final Scanner reader = new Scanner(System.in);
            int n = reader.nextInt();
            ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(n);
            new Thread(() -> {
                try {
                    zeroEvenOdd.printZero(System.out::print);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(() -> {
                try {
                    zeroEvenOdd.printEven(System.out::print);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(() -> {
                try {
                    zeroEvenOdd.printOdd(System.out::print);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    class ZeroEvenOdd {
        private int n;
        private int i;
        public ZeroEvenOdd(int n) {
            this.n = n;
            this.i=1;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public synchronized void printZero(IntConsumer printNumber) throws InterruptedException {
            printNumber.accept(0);
        }

        public synchronized void printEven(IntConsumer printNumber) throws InterruptedException {
            while (i<=n){
                if((i&1)==1){
                    printNumber.accept(i++);
                }
            }
        }

        public synchronized void printOdd(IntConsumer printNumber) throws InterruptedException {
            while (i<=n){
                if((i&1)==0){
                    printNumber.accept(i++);
                }
            }
        }

}
