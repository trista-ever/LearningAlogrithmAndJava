package LeetCode;
import java.util.HashMap;
/**
 * 2017/5/8 22:06
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 *
 * @author weiyu si
 */
public class CopyListwithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {

        if(head== null) return null;
        RandomListNode newhead = new RandomListNode(head.label);
        RandomListNode p= head;
        RandomListNode q= newhead;
        Map<RandomListNode,RandomListNode> a = new HashMap<>();
        a.put(p,q);
        while(p.next!=null){
            RandomListNode tmp= new RandomListNode(p.next.label);
            a.put(p.next,tmp);
            q.next=tmp;
            p=p.next;
            q=q.next;
        }
        p=head;
        q=newhead;
        while(p!=null){
            if(p.random!=null) q.random= a.get(p.random); //找到random节点对应的节点
            p=p.next;
            q=q.next;
        }
        return newhead;

    }
}
