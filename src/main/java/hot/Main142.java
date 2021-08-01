package hot;

import java.util.HashSet;
import java.util.Set;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main142 {

    public ListNode detectCycle(ListNode head) {
       ListNode fast=head,slow=head;
       while (true){
           if(fast==null||fast.next==null){
               return null;
           }
           fast=fast.next.next;
           slow=slow.next;
           if(fast==slow){
               break;
           }
       }
       fast=head;
       while (fast!=slow){
           fast=fast.next;
           slow=slow.next;
       }
       return fast;
    }

    public ListNode detectCycle1(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        ListNode tmp=head;
        while (tmp!=null){
            if(!set.add(tmp)){
                return tmp;
            }
            tmp=tmp.next;
        }
        return null;
    }
}
