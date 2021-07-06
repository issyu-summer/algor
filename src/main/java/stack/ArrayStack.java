package stack;

import java.util.Iterator;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public abstract class ArrayStack<T> implements Stack<T>,Iterable<T>{

    private int size;
    private int cap;
    private T[] ar;

    public ArrayStack(int cap){
        this.cap=cap;
        this.size=0;
        this.ar= (T[]) new Object[cap];
    }

    @Override
    public int cap(){
        return cap;
    }

    @Override
    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void push(T elem){
        if(size>=cap){
//            throw new ArrayStoreException("栈已满");
            resize(2*cap);
        }
        ar[size++]=elem;
    }

    @Override
    public T pop(){
        T t = ar[--size];
        ar[size]=null;
        if(size>0&&size==cap/4){
            resize(cap/2);
        }
        return t;
    }

    /**
     * 改变容量
     */
    private void resize(int max){
        T [] tmp= (T[]) new Object[max];
        if (size >= 0) {
            System.arraycopy(ar, 0, tmp, 0, size);
        }
        ar=tmp;
    }

    /**
     * 逆向迭代器
     */
    class ReverseIterator implements Iterator<T>{
        //迭代不会改变数据结构
        private int tmp=size;

        @Override
        public boolean hasNext() {
            return tmp>0;
        }

        @Override
        public T next() {
            return ar[--tmp];
        }
    }

    @Override
    public Iterator<T> iterator(){
        return new ReverseIterator();
    }
}
