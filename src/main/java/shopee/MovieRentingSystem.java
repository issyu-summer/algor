package shopee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class MovieRentingSystem {

    class Entry implements Comparable<Entry>{
        private Integer shop;
        private Integer movie;
        private Integer price;

        public Entry(int shop, int movie, int price) {
            this.movie = movie;
            this.shop = shop;
            this.price = price;
        }

        @Override
        public int compareTo(Entry o) {
            return this.price.compareTo(o.price);
        }
    }

    //按顺序poll
    private PriorityQueue<Entry> queueNotLend;
    private PriorityQueue<Entry> queueLend;
    private int n;

    public MovieRentingSystem(int n, int[][] entries) {
        this.n=n;
        queueNotLend = new PriorityQueue<>();
        queueLend = new PriorityQueue<>();
        for (int[] ar : entries) {
            Entry entry = new Entry(ar[0], ar[1], ar[2]);
            queueNotLend.add(entry);
        }
    }

    public List<Integer> search(int movie) {
        List<Integer> res = new ArrayList<>();
        if (queueNotLend.size() == 0) {
            return res;
        }
        List<Entry> tmp=new ArrayList<>();
        while (!queueNotLend.isEmpty()){
            if (res.size() >= 5) {
                break;
            }
            Entry en=queueNotLend.poll();
            tmp.add(en);
            if (en.movie == movie) {
                res.add(en.shop);
            }
        }
       queueNotLend.addAll(tmp);
        return res;
    }

    private Entry find(int shop, int movie,PriorityQueue<Entry> queue) {
        Entry en = null;
        for (Entry entry : queue) {
            if (entry.shop == shop && entry.movie == movie) {
                en=entry;
                break;
            }
        }
        return en;
    }
    public void rent(int shop, int movie) {
        Entry en = find(shop, movie,queueNotLend);
        queueNotLend.remove(en);
        queueLend.add(en);
    }


    public void drop(int shop, int movie) {
        Entry en =find(shop,movie,queueLend);
        queueLend.remove(en);
        queueNotLend.add(en);
    }

    public List<List<Integer>> report() {
        List<List<Integer>> res = new ArrayList<>();
        if (queueLend.isEmpty()) {
            return res;
        }
        List<Entry> tmp=new ArrayList<>();
        while (!queueLend.isEmpty()){
            if (res.size() >= 5) {
                break;
            }
            Entry en = queueLend.poll();
            tmp.add(en);
            List<Integer> shop = List.of(en.shop, en.movie);
            res.add(shop);
        }
        queueLend.addAll(tmp);
        return res;
    }
}
