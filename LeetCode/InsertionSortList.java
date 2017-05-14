package LeetCode;

/**
 * 2017/5/14 21:27
 *  Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * listNode操作，针对节点，no节点val，区分开数组
 * @author weiyu si
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode cur = head;
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ListNode next=null;
        while(cur!=null){
            while(pre.next!=null&&pre.next.val<cur.val) pre=pre.next;
            next = cur.next;
            cur.next=pre.next;
            pre.next=cur;
            pre=dummy;
            cur=next;
        }
        return dummy.next;

    }
}
