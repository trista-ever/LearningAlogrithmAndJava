package LeetCode;

/**
 * 2017/5/14 22:23
 *链表使用归并排序，nlog（n）
 * @author weiyu si
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if(head==null|| head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head1 = slow.next;
        slow.next=null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(head1);
        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy= new ListNode(0);
        ListNode st=dummy;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                st.next=l1;
                l1=l1.next;
            }else{
                st.next= l2;
                l2=l2.next;
            }
            st=st.next;
        }
        while(l1!=null){
            st.next=l1;
            l1=l1.next;
            st=st.next;
        }
        while(l2!=null){
            st.next=l2;
            l2=l2.next;
            st=st.next;
        }
        return dummy.next;
    }
}
