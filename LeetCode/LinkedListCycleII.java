package LeetCode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 * 环以外长x，相遇时距离环开始k，环长Y
 * 则2(x+b)=x+b+N*Y
 * -> N*Y -b =x
 *
 * 2017/5/7 21:50
 *
 * @author weiyu si
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(fast==null||fast.next==null) return null; //fast==null 注意链表为空
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;  //此时slow和fast都前进1
        }
        return slow;
    }
}
