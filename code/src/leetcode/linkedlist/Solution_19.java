package leetcode.linkedlist;

import java.util.List;

public class Solution_19 {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummyHead = new ListNode(-1, head);
        ListNode front = dummyHead;
        ListNode tail = dummyHead;

        for(int i=0; i<n+1; i++)
            tail = tail.next;
        while (tail != null){
            front = front.next;
            tail = tail.next;
        }

        ListNode delNode = front.next;
        front.next = delNode.next;
        delNode.next = null;

        return dummyHead.next;
    }
}
