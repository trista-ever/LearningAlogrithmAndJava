package LeetCode;
import java.util.List;
/**
 * 2017/5/9 23:04
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 *reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

 *You must do this in-place without altering the nodes' values.

 *For example,
 *Given {1,2,3,4}, reorder it to {1,4,2,3}.
 *
 * 思路：链表inplace reverse, then merge
 * @author weiyu si
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse the second part of the list
        ListNode l=slow.next;

        slow.next=null;
        l=reverse(l);
        // merge the two sorted list
        crossmerge(head,l);

    }
    public ListNode reverse(ListNode l){
        if(l==null||l.next==null) return l;
        ListNode pre=l;
        ListNode cur=l.next;
        //可能存在后面为0或为1
        while(cur!=null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur=tmp;
        }
        l.next=null;
        return pre;
    }
    public void crossmerge(ListNode st,ListNode lt){
        ListNode st1=st,lt1=lt;
        while(lt1!=null){
            ListNode tp1 = st1.next;
            ListNode tp2 = lt1.next;
            st1.next=lt1;
            lt1.next=tp1;
            st1=tp1;
            lt1=tp2;
        }
    }
}
