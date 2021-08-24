package today1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */



/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Main1 {

     static class ListNode {
    int val;
    ListNode next = null;

         public ListNode(int i) {
             this.val=5;
         }
     }
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode cur=dummy,h1,t1,pre,next;
        for(int i=1;i<m;i++){
            cur=cur.next;
        }
        pre=cur;
        h1=cur.next;
        cur=dummy;
        for(int i=1;i<n+1;i++){
            cur=cur.next;
        }
        t1=cur;
        next=cur.next;
        ListNode [] nodes=reverse(h1,t1);
        pre.next=nodes[0];
        nodes[1].next = next;
        return dummy.next;
    }

    private ListNode[]  reverse(ListNode head,ListNode tail){
        if(head==null){
            return new ListNode[]{
                    tail,head
            };
        }
        ListNode pre=tail.next,cur=head;
        while(pre!=tail){
            ListNode tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return new ListNode[]{
                tail,head
        };
    }

    public static void main(String[] args) {
       Map<Person,Integer> map=new HashMap<>();
        Person asdf = new Person("asdf", 10);
        map.put(asdf,10);
        System.out.println(asdf.hashCode());
        System.out.println(map.get(asdf));
        asdf.setName("asdfasfa");
        System.out.println(asdf.hashCode());
        System.out.println(map.get(asdf));
        for (Person p:map.keySet()){
            System.out.println(p.getName());
        }

    }
}
