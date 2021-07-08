package max_queue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class MaxPq<T extends Comparable<T>> {

    //pq[0]没有被使用,pq[1...size]
    private T[] pq;
    private int size;

    public MaxPq() {

    }

    public MaxPq(int cap) {
        this.size = 0;
        pq = (T[]) new Comparable[cap + 1];
    }

    public MaxPq(T[] a) {

    }


    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exchange(k / 2, k);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= size) {
            int j = 2 * k;
            if (j < size && less(j, j + 1)) {
                j++;
            }
            if (!less(k, j)) {
                break;
            }
            exchange(k, j);
            k = j;
        }
    }

    public T delMax() {
        T max = pq[1];
        exchange(1, size--);
        pq[size + 1] = null;
        sink(1);
        if (size > 0 && size == pq.length / 4) {
            resize(pq.length / 2);
        }
        return max;
    }

    public void insert(T elem) {
        if (size >= pq.length) {
            resize(2 * size);
        }
        pq[++size] = elem;
        swim(size);
    }

    public T max() {
        return pq[1];
    }

    public boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    public void exchange(int i, int j) {
        T t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(int newSize) {
        T[] tmp = (T[]) new Comparable[newSize];
        if (size >= 0) {
            System.arraycopy(pq, 0, tmp, 0, size);
        }
        this.pq = tmp;
    }


}
