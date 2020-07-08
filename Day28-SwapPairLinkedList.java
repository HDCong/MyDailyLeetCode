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
    public ListNode swapPairs(ListNode head) {
        if( head == null || head.next==null) return head;
        // Swap 2 first nodes
        ListNode cur=head,pre=head, f= head.next,res=head.next;
        cur.next=f.next;
        f.next=cur;
        pre=cur;
        cur=cur.next;
        while(cur!=null &&cur.next!=null){
            f= cur.next;
            cur.next=f.next;
            f.next=cur;
            pre.next=f;
            
            pre=cur;
            cur=cur.next;

        }
        return res;

    }
}