/**
 * 2017/3/28 19:18
 *
 * @author changyi yuan
 */

/*
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode p=new ListNode(0);
        ListNode q=new ListNode(0);
        p.next=head;
        q.next=p;
        while(p.next!=null){
            if(p.next.val==val){
                ListNode tmp=p.next;
                p.next=tmp.next;

            }else{
                p=p.next;
            }
        }
        return q.next;

    }


}

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode curr = head, prev = fakeHead;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return fakeHead.next;
    }
}

*/