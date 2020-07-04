/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next==null ) return head; // 1 node
        if(head.next.next==null) return head.next; // 2node
        ListNode sl = head, fast = head.next.next;        
        while(fast.next!=null && fast.next.next!=null){
            sl=sl.next;
            fast=fast.next.next;
        }
        if(fast.next==null)
            return sl.next;
        return sl.next.next;
    }
}