/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1 {

    class List<K>{
        K val;
        List<K> next;
        public List(){}
        public List(K val){
            this.val=val;
        }
    }

    List add(List<Integer> l1, List<Integer> l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        List<Integer> head=null;
        List<Integer> tail=null;
        int carry=0;
        while(l1!=null||l2!=null){
            int n1=l1==null?0:l1.val;
            int n2=l2==null?0:l2.val;
            int sum=n1+n2+carry;
            carry=sum/10;
            if(head==null){
                head=new List<>(sum%10);
                tail=head;
            }else {
                tail.next=new List<>(sum%10);
                tail=tail.next;
            }
            if(l1!=null){
                l1=l1.next;

            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return head;
    }

}
