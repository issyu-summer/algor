package code_top.byte_dance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main143 {

    public void reorderList(ListNode head) {
        ListNode cur=head;
        List<ListNode> list=new ArrayList<>();
        while (cur!=null){
            list.add(cur);
            cur=cur.next;
        }
        int i=0,j=list.size()-1;
        while (i<j){
            list.get(i).next=list.get(j);
            i++;
            if(i==j){
                break;
            }
            list.get(j).next=list.get(i);
            j--;
        }
        list.get(i).next=null;
    }

    //中点断开+反转第二个+拼接
    public void reorderList1(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode lHead=head;
        ListNode mid = mid(head);
        ListNode rHead=mid.next;
        mid.next=null;
        rHead=reverse(rHead);
        while (rHead!=null){
            ListNode tmp=rHead.next;
            rHead.next=lHead.next;
            lHead.next=rHead;
            lHead=rHead.next;
            rHead=tmp;
        }
    }

    //反转链表
    private ListNode reverse(ListNode head){
        ListNode pre=null,cur=head;
        while (cur!=null){
            ListNode tmp = cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;
    }
    //中点
    private ListNode mid(ListNode head){
        ListNode slow=head,fast=head;
        while (fast.next!=null&&fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
