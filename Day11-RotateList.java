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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        
        int length = findLength(head);
        k =k %length;
        int count = 1;
        // Find the newtail, and oldtail
        ListNode newTail = head, p=head;
        while (count!=length){
            p = p.next;
            ++count;
            if(count== length-k)
                newTail = p;
        }
        // Now oldTail is p, newTail is setted
        p.next= head;
        head= newTail.next;
        newTail.next =null;
        return head;
        
    }
    private int findLength(ListNode head){
        ListNode p = head;
        int res =0 ;
        while(p!=null){
            ++res;
            p=p.next;
        }
        return res;
    }
}