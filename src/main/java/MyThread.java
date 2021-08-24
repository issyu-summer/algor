/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class MyThread implements Runnable{
    int i;
    ThreadLocal<Long> threadLocal;
    public MyThread(int i,long l){
        this.i=i;
        this.threadLocal=new ThreadLocal<>();
        threadLocal.set(l);
    }

    public MyThread(int i){
        this.i=i;
        this.threadLocal=new ThreadLocal<>();
    }
    @Override
    public void run() {
        i++;
        System.out.println(i);
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread(1);
        myThread.threadLocal.set(99999L);
        MyThread myThread1=new MyThread(2,990L);
        Thread thread = new Thread(myThread);
        thread.start();
        System.out.println("thread1:"+myThread.threadLocal.get());
        System.out.println("thread2:"+myThread1.threadLocal.get());
        System.out.println("thread1:"+myThread.threadLocal.get());
        System.out.println("thread2:"+myThread1.threadLocal.get());
    }
}
