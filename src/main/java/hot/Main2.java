package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode head=null,tail=null;
       int carry=0;
       while (l1!=null||l2!=null){
           int sum=(l1==null?0:l1.val)+(l2==null?0:l2.val)+carry;
           if(head==null){
               head=tail=new ListNode(sum%10);
           }else {
               tail.next=new ListNode(sum%10);
               tail=tail.next;
           }
           carry=sum/10;
           if(l1!=null){
               l1=l1.next;
           }
           if(l2!=null){
               l2=l2.next;
           }
       }
       if(carry>0){
           tail.next=new ListNode(carry);
       }
       return head;
    }
}
